package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int value  : numbers) {
            sum += value;
        }
        System.out.println(sum);
    }
}
