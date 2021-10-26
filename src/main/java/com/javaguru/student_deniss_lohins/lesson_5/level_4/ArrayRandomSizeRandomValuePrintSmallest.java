/*package com.javaguru.student_deniss_lohins.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayRandomSizeRandomValuePrintSmallest {

    public static void main(String[] args) {
        ArrayRandomSizeRandomValuePrintSmallest runner = new ArrayRandomSizeRandomValuePrintSmallest();
        int[] array = runner.randomFill();
        runner.printResults(array);
        runner.printSmallestValue(array);
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

    private void printSmallestValue(int[] array) {
        int smallestValue = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        System.out.println("Smallest array value is: " + smallestValue);
    }
}
*/