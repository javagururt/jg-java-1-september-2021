package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_2_intern;

import java.util.Random;

class ArrayWithRandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];
        for (int i=0; i<3; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Values of array with random numbers:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
