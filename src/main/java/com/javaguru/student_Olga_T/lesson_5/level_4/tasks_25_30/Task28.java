package com.javaguru.student_Olga_T.lesson_5.level_4.tasks_25_30;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {

        Random random = new Random();

        int generate = random.nextInt(6);
        int[] generateArray = new int[generate];

        for (int i = 0; i < generateArray.length; i++) {
            generateArray[i] = random.nextInt(15);
            System.out.println("generateArray [" + i + "] = " + generateArray[i]);
        }

        int min = generateArray[0];
        for (int i = 1; i < generateArray.length; i++) {
            if (generateArray[i] < min) {
                min = generateArray[i];
            }
        }
        System.out.println("min = " + min);
    }
}
