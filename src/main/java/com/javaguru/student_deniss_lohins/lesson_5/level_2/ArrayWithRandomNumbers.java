package com.javaguru.student_deniss_lohins.lesson_5.level_2;

import java.util.Random;

class ArrayWithRandomNumbers {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

}
