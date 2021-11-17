package com.javaguru.student_Olga_T.lesson_5.level_4.tasks_25_30;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task27 {
    public static void main(String[] args) {

        Random random = new Random();

        int generate = random.nextInt(9);
        int[] generateArray = new int[generate];

        for (int i = 0; i < generateArray.length; i++) {
            generateArray[i] = random.nextInt(10);
            System.out.println("generateArray [" + i + "] = " + generateArray[i]);
        }

        int max = generateArray[0];
        for (int i = 1; i < generateArray.length; i++) {
            if (generateArray[i] > max) {
                max = generateArray[i];
            }
        }
        System.out.println("max = " + max);
    }
}



