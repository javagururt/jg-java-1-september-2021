package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.List;

class GameFieldService {
    private List<MarsRover> rovers;



    private List<MarsRover> finishedTheMissionRovers;

    public GameFieldService(List<MarsRover> rovers, List<MarsRover> finishedTheMissionRovers) {
        this.rovers = rovers;
        this.finishedTheMissionRovers = finishedTheMissionRovers;
    }

    void playingField(String[][] field, String[][] resultField) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                if (chekThisOnlyRovers(field, i, j)) {
                    setRoversCompassField(field, resultField, i, j);
                } else {
                    zeroResultField(field, resultField, i, j);
                }

                setEndCoordinatesSign(field, resultField, i, j);
                setFinishedTheMissionRoversGameField(field, resultField, i, j);
            }

        }
    }


    void fillInTheField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "0";
            }
        }
    }

    void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println(" ");
        }
    }


    private boolean chekThisOnlyRovers(String[][] field, int i, int j) {
        return !field[i][j].equals("0") &&
                !field[i][j].equals("◁") &&
                !field[i][j].equals("△") &&
                !field[i][j].equals("▷") &&
                !field[i][j].equals("▽");
    }

    private void setRoversCompassField(String[][] field, String[][] resultField, int i, int j) {
        for (int k = 0; k < rovers.size(); k++) {
            if (rovers.get(k).getNumberRover().equals(field[i][j])) {
                resultField[i][j] = (rovers.get(k).getCompass());
            }
        }
    }

    private void zeroResultField(String[][] field, String[][] resultField, int i, int j) {
        if (!field[i][j].equals("0")) {
            resultField[i][j] = field[i][j];
        } else {
            resultField[i][j] = ".";
        }
    }

    private void setEndCoordinatesSign(String[][] field, String[][] resultField, int i, int j) {

        if (rovers.get(rovers.size() - 1).getEndCoordinates()[0] == i &&
                rovers.get(rovers.size() - 1).getEndCoordinates()[1] == j) {
            for (int k = 0; k < rovers.size(); k++) {

                if (!field[i][j].contains(rovers.get(k).getNumberRover())) {
                    resultField[i][j] = "√";


                }
            }

        }
    }

    private void setFinishedTheMissionRoversGameField(String[][] field, String[][] resultField, int i, int j) {
        for (int l = 0; l < finishedTheMissionRovers.size(); l++) {
            if (finishedTheMissionRovers.get(l).getCurrentCoordinates()[0] == (i) &&
                    finishedTheMissionRovers.get(l).getCurrentCoordinates()[1] == (j)) {
                resultField[i][j] = finishedTheMissionRovers.get(l).getCompass();
            }
        }
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
}
