package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mySuperArray = new int[3];

        for (int i = 0; i < mySuperArray.length; i++) {
            mySuperArray[i] = random.nextInt(10);
        }

        int sum = 0;
        for (int i = 0; i < mySuperArray.length; i++) {
            sum += mySuperArray[i];
            System.out.println("mySuperArray [" + i + "] = " + mySuperArray[i]);
        }

        double avg = (double) sum / mySuperArray.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
