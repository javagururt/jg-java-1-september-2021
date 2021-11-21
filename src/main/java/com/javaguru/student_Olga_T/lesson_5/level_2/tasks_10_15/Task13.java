package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myBestArray = new int[3];

        for (int i = 0; i < myBestArray.length; i++) {
            myBestArray[i] = random.nextInt(10);
        }

        int sum = 0;
        for (int i = 0; i < myBestArray.length; i++) {
            sum += myBestArray[i];
            System.out.println("myBestArray [" + i + "] = " + myBestArray[i]);
        }
        System.out.println("sum = " + sum);
    }
}
