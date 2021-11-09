package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;


import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class Task1ArrayDefinition1 {

    public static void main(String[] args) {
        //Task 1
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 46;
        numbers[2] = 92;
        System.out.println("All numbers are = " + Arrays.toString(numbers));
    }
}
