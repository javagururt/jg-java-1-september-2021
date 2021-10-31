package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayWithRandomLengthAndValues {
    public static void main(String[] args) {
        int arrayLength;
        int minArrayValue;

        Random random = new Random();
        arrayLength = random.nextInt(10);
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++ ) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Values of array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        minArrayValue = numbers[0];
        for (int i = 0; i < arrayLength; i++) {
            if (minArrayValue > numbers[i]) {
                minArrayValue = numbers[i];
            }
        }
        System.out.println("Smallest array value: " + minArrayValue);

        System.out.println("Even array values: ");
        for (int i = 0; i < arrayLength; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Odd array values: ");
        for (int i = 0; i < arrayLength; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
