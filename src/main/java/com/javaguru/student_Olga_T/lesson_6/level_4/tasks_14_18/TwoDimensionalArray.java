package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import java.util.Random;

class TwoDimensionalArray {


    public int[][] createTwoDimensionalArray() {
        int[][] doubleArray = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                doubleArray[i][j] = random.nextInt(20);
            }
        }
        return doubleArray;
    }


    public int sumDoubleArray(int[][] sumOfTwoArrays) {
        int sum = 0;
        for (int i = 0; i < sumOfTwoArrays.length; i++) {
            for (int j = 0; j < sumOfTwoArrays.length; j++) {
                sum += sumOfTwoArrays[i][j];
            }
        }
        return sum;
    }
}











