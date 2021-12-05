package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_18;

//Найти в интернете и написать пример кода в котором:
//- создать класс TwoDimensionalArray,
//        - создать метод для заполнения массива случайными числами,
//        - создать метод для подсчёта суммы всех чисел в массиве.

import java.util.Random;

public class TwoDimensionalArray {

    public int[][] createTwoArrays() {
        int[][] doubleArray = new int[5][9];
        Random random = new Random();

        for (int i = 0; i < doubleArray.length; i++) {
            for (int a = 0; a < doubleArray.length; a++) {
                doubleArray[i][a] = random.nextInt(10);
            }
        }
        return doubleArray;
    }


    public int sumOfDoubleArray(int[][] sumOfTwoArrays) {
        int sum = 0;
        for (int i = 0; i < sumOfTwoArrays.length; i++) {
            for (int a = 0; a < sumOfTwoArrays.length; a++) {
                sum += sumOfTwoArrays[i][a];
            }
        }
        return sum;
    }
}
