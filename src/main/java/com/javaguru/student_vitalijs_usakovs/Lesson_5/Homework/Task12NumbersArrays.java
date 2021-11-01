package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import java.util.Arrays;
import java.util.Random;

class Task12NumbersArrays {
    //TASK12

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] numbers = new int[3];

        numbers[0] = randomGenerator.nextInt();
        numbers[1] = randomGenerator.nextInt();
        numbers[2] = randomGenerator.nextInt();
        System.out.println("All numbers are = " + Arrays.toString(numbers));
    }
}
