package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] totalArray = new int[3];

        for (int i = 0; i < totalArray.length; i++) {
            totalArray[i] = random.nextInt(10);
            System.out.println("totalArray [" + i + "] = " + totalArray[i]);

        }

        System.out.println();

        for (int i = 0; i < totalArray.length; i++) {
            System.out.print("totalArray [" + i + "] = " + totalArray[i] + " + 2 = ");
            totalArray[i] += 2;
            System.out.println(totalArray[i]);
        }
    }

}
