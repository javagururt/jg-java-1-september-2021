package com.javaguru.student_dmitrii_faierberg.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class PositiveOrNegativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result;
        //Task 1   result = value > 0 ? "positive" : "negative";

        if (value > 0) result = "positive";
        else if (value < 0) result = "negative";
        else result = "zero";

        System.out.println(value + " is " + result);
    }
}
