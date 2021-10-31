package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayValueIncrease {
    public static void main(String[] args) {
        int sumOfArray;

        Random random = new Random();
        int[] numbers = new int[3];
        for (int i=0; i<3; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Array: {" + numbers[0] + "; " + numbers[1] + "; " + numbers[2] + "}");
        for (int i=0; i<3; i++) {
            numbers[i] = numbers[i] + 2;
        }
        System.out.println("Array with values increased: {" + numbers[0] + "; " + numbers[1] + "; " + numbers[2] + "}");
    }
}
