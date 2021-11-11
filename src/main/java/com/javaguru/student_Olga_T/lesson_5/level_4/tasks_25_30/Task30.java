package com.javaguru.student_Olga_T.lesson_5.level_4.tasks_25_30;

import java.util.Random;

class Task30 {
    public static void main(String[] args) {
        Random randomArray = new Random();

        int[] generateArray = new int[randomArray.nextInt(14)];


        for (int i = 0; i < generateArray.length; i++) {
            generateArray[i] = randomArray.nextInt(20);
            System.out.println("generateArray [" + i + "] = " + generateArray[i]);
        }

        System.out.println("Odd numbers:");

        for (int i = 0; i < generateArray.length; i++) {
            if (generateArray[i] % 2 == 1) {
                System.out.println("generateArray [" + i + "] = " + generateArray[i]);
            }
        }
    }
}

