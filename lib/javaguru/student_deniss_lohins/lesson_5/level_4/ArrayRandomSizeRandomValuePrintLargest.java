package com.javaguru.student_deniss_lohins.lesson_5.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayRandomSizeRandomValuePrintLargest {
    public static void main(String[] args) {
        ArrayRandomSizeRandomValuePrintLargest runner = new ArrayRandomSizeRandomValuePrintLargest();
        int[] array = runner.randomFill();
        runner.printResults(array);
        runner.printBiggestValue(array);

    }

    private int[] randomFill() {
        Random randomGenerator = new Random();
        int arrayLength = randomGenerator.nextInt(0, 50);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
        return array;
    }

    private void printResults(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    private void printBiggestValue(int[] array) {
        int largestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
            }
        System.out.println("Largest array value is: " + largestValue);
    }
}
