package com.javaguru.student_nikita_simans.homework.lesson_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ThreeRandomNumbersArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = (int) (Math.random() * 101);
        numbers[1] = (int) (Math.random() * 101);
        numbers[2] = (int) (Math.random() * 101);

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum / numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}
