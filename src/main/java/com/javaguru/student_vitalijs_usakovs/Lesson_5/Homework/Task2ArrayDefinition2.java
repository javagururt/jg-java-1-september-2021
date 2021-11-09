package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class Task2ArrayDefinition2 {
//Task 2
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 4;
        numbers[3] = 6;
        numbers[4] = 12;
        numbers[5] = 23;
        numbers[6] = 46;
        numbers[7] = 92;
        numbers[8] = 184;
        numbers[9] = 368;
        System.out.println("All numbers are = " + Arrays.toString(numbers));
    }

}
