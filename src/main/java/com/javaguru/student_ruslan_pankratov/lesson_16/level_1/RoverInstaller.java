package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.List;

class RoverInstaller {

    private List<MarsRover> rovers;

    public RoverInstaller(List<MarsRover> rovers) {
        this.rovers = rovers;
    }

    public void roverInstallation(int numberOfRovers, String[][] field) {
        int numberThisRovers = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i].equals("0") && numberOfRovers != 0) {
                    numberThisRovers += 1;
                    numberOfRovers -= 1;
                    randomEndCoordinates(field, numberThisRovers, i, j);
                }
            }
        }
    }

    private void randomEndCoordinates(String[][] field, int numberThisRovers, int i, int j) {
        int endCoordinatesOne = (int) (Math.random() * (field.length));
        int endCoordinatesTwo = (int) (Math.random() * (field[i].length - 3) + 3);
        int[] arrCordinat = {endCoordinatesOne, endCoordinatesTwo};
        MarsRover marsRover1 = new MarsRover("▶",
                arrCordinat, numberThisRovers + "");
        int[] currentCoordinates = {j, i};
        marsRover1.setCurrentCoordinates(currentCoordinates);
        rovers.add(marsRover1);
        field[j][i] = "" + numberThisRovers;
    }
}
