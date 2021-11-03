package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;
@CodeReview(approved = true)
class Task15ThreeNumbersNumberThree {
    //Task15

    public static void main(String[] args) {

        int[] numbers = {61, 97, 4, 37, 12};
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        int plus = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += plus;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
