package com.javaguru.student_deniss_lohins.lesson_5.level_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
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
