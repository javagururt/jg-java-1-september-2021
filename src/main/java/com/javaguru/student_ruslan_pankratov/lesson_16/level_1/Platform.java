package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Platform {

    protected static boolean breakFor = true;
    private List<MarsRover> rovers = new ArrayList<>();
    private List<MarsRover> finishedTheMissionRovers = new ArrayList<>();
    private final RandomValidator validator = new RandomValidator(rovers);
    private final RoverInstaller installer = new RoverInstaller(rovers);
    private final MovementService movementService = new MovementService(rovers, finishedTheMissionRovers);

    public static void main(String[] args) {
        Platform platform = new Platform();
        String[][] res = new String[5][10];
        platform.start(res, 6);
    }

    public void start(String[][] field, int numberOfRovers) {
        GameFieldService gameFieldService = new GameFieldService(rovers, finishedTheMissionRovers);
        gameFieldService.fillInTheField(field);

        installer.roverInstallation(numberOfRovers, field);
        validator.randomCheck(field);

        String[][] resultField = new String[field.length][field[0].length];

        roverMovement(field, resultField, gameFieldService);
    }

    private void roverMovement(String[][] field, String[][] resultField, GameFieldService gameFieldService) {
        while (true) {
            if (rovers.size() > 0) {

                gameFieldService.playingField(field, resultField);
                gameFieldService.printField(resultField);

                if (movementService.endPoint()) {
                    finishedTheMissionRovers.add(rovers.get(rovers.size() - 1));
                    rovers.remove(rovers.size() - 1);
                }
                Scanner scanner = new Scanner(System.in);
                String playerCommanders = scanner.nextLine();

                int playRoverInt = Integer.parseInt(rovers.get(rovers.size() - 1).getNumberRover());
                if (playerCommanders.equals("R")) {
                    movementService.toTheRight(field, playRoverInt);
                }
                if (playerCommanders.equals("L")) {
                    movementService.toTheLeft(field, playRoverInt);
                }
                if (playerCommanders.equals("M")) {
                    movementService.turnForward(field, playRoverInt + "");
                }

            } else {
                System.out.println("Win");
                break;
            }
        }
    }

    public static boolean isBreakFor() {
        return breakFor;
    }

    public static void setBreakFor(boolean breakFor) {
        Platform.breakFor = breakFor;
    }

    public List<MarsRover> getRovers() {
        return rovers;
    }

    public void setRovers(List<MarsRover> rovers) {
        this.rovers = rovers;
    }

    public List<MarsRover> getFinishedTheMissionRovers() {
        return finishedTheMissionRovers;
    }

    public void setFinishedTheMissionRovers(List<MarsRover> finishedTheMissionRovers) {
        this.finishedTheMissionRovers = finishedTheMissionRovers;
    }

    public RandomValidator getValidator() {
        return validator;
    }

    public RoverInstaller getInstaller() {
        return installer;
    }

    public MovementService getMovementService() {
        return movementService;
    }
}

