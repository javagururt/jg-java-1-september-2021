package com.javaguru.student_deniss_lohins.lesson_5.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int largestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }

    public int findMinNumber(int[] array) {
        int smallestValue = 99999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
}
