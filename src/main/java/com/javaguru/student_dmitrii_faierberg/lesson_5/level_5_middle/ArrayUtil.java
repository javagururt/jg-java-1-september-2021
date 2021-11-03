package com.javaguru.student_dmitrii_faierberg.lesson_5.level_5_middle;

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
        for(int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(20);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = 99999999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
