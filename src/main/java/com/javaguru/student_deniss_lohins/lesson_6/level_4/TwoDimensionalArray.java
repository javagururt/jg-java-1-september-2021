package com.javaguru.student_deniss_lohins.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public void createArray(int columns, int rows) {
        int[][] array = new int[columns][rows];
    }

    public void fill2DArrayWithrandomNumbers(int[][] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] = randomGenerator.nextInt(100);
            }
        }

    }
}
