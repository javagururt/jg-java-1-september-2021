package com.javaguru.student_dmitrii_faierberg.lesson_2.level_3;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
