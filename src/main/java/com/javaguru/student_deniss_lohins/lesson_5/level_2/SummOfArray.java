package com.javaguru.student_deniss_lohins.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class SummOfArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
