package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] superPuperArray = new int[3];

        for (int i = 0; i < superPuperArray.length; i++) {
            superPuperArray[i] = random.nextInt(100);
            System.out.println("superPuperArray [" + i + "] = " + superPuperArray[i]);
        }
    }

}
