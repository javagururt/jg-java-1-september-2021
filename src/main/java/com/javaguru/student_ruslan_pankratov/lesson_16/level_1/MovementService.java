package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.ArrayList;
import java.util.List;

import static student_ruslan_pankratov.lesson_16.level_1.Platform.breakFor;

class MovementService {
    private List<MarsRover> rovers;
    private List<MarsRover> finishedTheMissionRovers;

    public MovementService(List<MarsRover> rovers, List<MarsRover> finishedTheMissionRovers) {
        this.rovers = rovers;
        this.finishedTheMissionRovers = finishedTheMissionRovers;
    }

    public void turnForward(String[][] field, String numberRover) {

        breakFor = true;
        edgeCheck(field, numberRover);
        if (endPoint()) {
            finishedTheMissionRovers.add(rovers.get(rovers.size() - 1));
            rovers.remove(rovers.size() - 1);

        }
    }

    public void toTheRight(String[][] field, int playRoverInt) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(playRoverInt + "")) {
                    if (rovers.get(playRoverInt - 1).getCompass().equals("▶")) {
                        rovers.get(playRoverInt - 1).setCompass("▼");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("▼")) {
                        rovers.get(playRoverInt - 1).setCompass("◀");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("◀")) {
                        rovers.get(playRoverInt - 1).setCompass("▲");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("▲")) {
                        rovers.get(playRoverInt - 1).setCompass("▶");
                    }
                }
            }
        }
    }

    public void toTheLeft(String[][] field, int playRoverInt) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(playRoverInt + "")) {
                    if (rovers.get(playRoverInt - 1).getCompass().equals("▶")) {
                        rovers.get(playRoverInt - 1).setCompass("▲");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("▲")) {
                        rovers.get(playRoverInt - 1).setCompass("◀");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("◀")) {
                        rovers.get(playRoverInt - 1).setCompass("▼");
                    } else if (rovers.get(playRoverInt - 1).getCompass().equals("▼")) {
                        rovers.get(playRoverInt - 1).setCompass("▶");
                    }
                }
            }
        }
    }

    public boolean endPoint() {
        if (rovers.get(rovers.size() - 1).getCurrentCoordinates()[0] == (rovers.get(rovers.size() - 1).getEndCoordinates()[0]) &&
                rovers.get(rovers.size() - 1).getCurrentCoordinates()[1] == (rovers.get(rovers.size() - 1).getEndCoordinates()[1])) {
            return true;
        }
        return false;
    }

    private void edgeCheck(String[][] field, String numberRover) {
        breakFor = true;
        if (breakFor) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (breakFor) {
                        if (field[0][0].equals(numberRover)) {
                            corneringActions(field, 0, 0, numberRover, "▶", "▼");

//
                        } else if (field[0][field[0].length - 1].equals(numberRover)) {
                            corneringActions(field, 0, field[0].length - 1, numberRover, "◀", "▼");

                        } else if (field[field.length - 1][field[field.length - 1].length - 1].equals(numberRover)) {
                            corneringActions(field, field.length - 1, field[field.length - 1].length - 1, numberRover
                                    , "◀", "▲");
                        } else if (field[field.length - 1][0].equals(numberRover)) {
                            corneringActions(field, field.length - 1, 0, numberRover, "▲", "▶");
                        } else if (field[0][j].equals(numberRover)) {
                            if (allCornersCheck(numberRover, field)) {
                                corneringActions(field, 0, j, numberRover, "◀", "▼", "▶");
                            }

                        } else if (field[i][field[i].length - 1].equals(numberRover)) {
                            if (allCornersCheck(numberRover, field)) {

                                corneringActions(field, i, field[i].length - 1, numberRover, "▲", "◀", "▼");
                            }

                        } else if (field[field.length - 1][j].equals(numberRover)) {
                            if (allCornersCheck(numberRover, field)) {
                                corneringActions(field, field.length - 1, j, numberRover, "◀", "▲", "▶");
                            }
                        } else if (field[i][0].equals(numberRover)) {
                            if (allCornersCheck(numberRover, field)) {
                                corneringActions(field, i, 0, numberRover, "▲", "▶", "▼");
                            }

                        } else if (cornerCheck(field, i, j, numberRover)) {
                            if (i != 0 && i != field.length - 1 && j != 0 && j != field[i].length - 1
                                    && field[i][j].equals(numberRover)) {
                                if (allCornersCheck(numberRover, field)) {
                                    corneringActions(field, i, j, numberRover, "▲", "▶", "▼", "◀");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void corneringActions(String[][] field, int i, int j, String numberRover, String... arrActions) {
        List<String> access = new ArrayList<>();

        for (int k = 0; k < arrActions.length; k++) {
            access.add(arrActions[k]);
        }

        if (rovers.get(rovers.size() - 1).getCompass().equals("▲")
                && access.contains("▲")) {

            if (!checkForContentAheadOfAnotherRover(field, i - 1, j) &&
                    avoidCollision(i - 1, j)) {
                corneringActionsUp(field, i, j, numberRover);
            }
        } else if (rovers.get(rovers.size() - 1).getCompass().equals("◀") //▲
                && access.contains("◀")) {
            if (!checkForContentAheadOfAnotherRover(field, i, j - 1) &&
                    avoidCollision(i, j - 1)) {
                corneringActionsLeft(field, i, j, numberRover);
            }
        } else if (rovers.get(rovers.size() - 1).getCompass().equals("▼") //▼//i+ 1 j
                && access.contains("▼")) {

            if (!checkForContentAheadOfAnotherRover(field, i + 1, j) &&
                    avoidCollision(i + 1, j)) {
                corneringActionsDown(field, i, j, numberRover);
            }

        } else if (rovers.get(rovers.size() - 1).getCompass().equals("▶") //
                && access.contains("▶")) {

            if (!checkForContentAheadOfAnotherRover(field, i, j + 1) &&
                    avoidCollision(i, j + 1)) {
                corneringActionsRight(field, i, j, numberRover);

            }
        }
    }

    private boolean checkForContentAheadOfAnotherRover(String[][] field, int i, int j) {
        for (int k = 0; k < rovers.size(); k++) {
            if (field[i][j].equals(rovers.get(k).getNumberRover())) {
                return true;
            }
        }
        return false;
    }

    private boolean avoidCollision(int i, int j) {
        for (int k = 0; k < finishedTheMissionRovers.size(); k++) {
            if (checkForFiniteRoversOfFinalCoordinates(k, i, j)) {
                return false;
            }
        }
        return true;

    }

    private boolean allCornersCheck(String numberRover, String[][] field) {
        if (!field[0][0].equals(numberRover) &&
                !field[0][field[0].length - 1].equals(numberRover) &&
                !field[field.length - 1][field[field.length - 1].length - 1].equals(numberRover) &&
                !field[field.length - 1][0].equals(numberRover)) {
            return true;
        }

        return false;
    }


    private boolean checkForFiniteRoversOfFinalCoordinates(int k, int i, int j) {
        return finishedTheMissionRovers.get(k).getCurrentCoordinates()[0] == i &&
                finishedTheMissionRovers.get(k).getCurrentCoordinates()[1] == j;
    }


    private void corneringActionsUp(String[][] field, int i, int j, String numberRover) {
        field[i][j] = "△";
        field[i - 1][j] = numberRover;
        int[] setCurrent = {i - 1, j};
        rovers.get(rovers.size() - 1).setCurrentCoordinates(setCurrent);
        breakFor = false;
    }


    private void corneringActionsLeft(String[][] field, int i, int j, String numberRover) {
        field[i][j] = "◁";
        field[i][j - 1] = numberRover;
        int[] setCurrent = {i, j - 1};
        rovers.get(rovers.size() - 1).setCurrentCoordinates(setCurrent);
        breakFor = false;
    }

    private void corneringActionsDown(String[][] field, int i, int j, String numberRover) {
        field[i][j] = "▽";
        field[i + 1][j] = numberRover;
        int[] setCurrent = {i + 1, j};
        rovers.get(rovers.size() - 1).setCurrentCoordinates(setCurrent);
        breakFor = false;
    }

    private void corneringActionsRight(String[][] field, int i, int j, String numberRover) {
        field[i][j] = "▷";
        field[i][j + 1] = numberRover;
        int[] setCurrent = {i, j + 1};
        rovers.get(rovers.size() - 1).setCurrentCoordinates(setCurrent);
        breakFor = false;
    }

    private boolean cornerCheck(String[][] field, int i, int j, String numberRover) {
        return !field[0][j].equals(numberRover) &&
                !field[i][field[i].length - 1].equals(numberRover) &&
                !field[field.length - 1][j].equals(numberRover) &&
                !field[i][0].equals(numberRover) &&
                breakFor;
    }
}
