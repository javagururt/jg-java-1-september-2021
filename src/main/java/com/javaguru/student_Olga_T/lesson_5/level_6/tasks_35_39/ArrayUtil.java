package com.javaguru.student_Olga_T.lesson_5.level_6.tasks_35_39;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {

    Random random = new Random();

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = 1 + random.nextInt(100 - 1); // 1 - 100
        return array;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
