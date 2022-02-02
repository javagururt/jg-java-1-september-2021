package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.List;

class RandomValidator {
    private List<MarsRover> rovers;

    public RandomValidator(List<MarsRover> rovers) {
        this.rovers = rovers;
    }

    public void randomCheck(String[][] field) {
        int turnOffRandom = 1;
        while (turnOffRandom > 0)
            for (int i = 0; i < rovers.size(); i++) {
                for (int j = 0; j < rovers.size(); j++) {
                    if (endCoordinatesCheck(i, j)) {
                        if (!rovers.get(i).getNumberRover().equals(rovers.get(j).getNumberRover())) {
                            turnOffRandom += 1;
                            createRandomEndCoordinates(field, j);
                        }
                    }
                }
                if (turnOffRandom == 1) {
                    turnOffRandom = 0;
                }
            }
    }

    private boolean endCoordinatesCheck(int i, int j) {
        return rovers.get(i).getEndCoordinates()[0] == ((rovers.get(j).getEndCoordinates())[0]) &&
                rovers.get(i).getEndCoordinates()[1] == ((rovers.get(j).getEndCoordinates())[1]);
    }

    private void createRandomEndCoordinates(String[][] field, int j) {
        int endCoordinatesOne = (int) (Math.random() * (field.length));
        int endCoordinatesTwo = (int) (Math.random() * (field[0].length - 3) + 3);
        int[] arrCordinat = {endCoordinatesOne, endCoordinatesTwo};
        rovers.get(j).setEndCoordinates(arrCordinat);
    }
}
