package com.javaguru.student_ruslan_pankratov.lesson_2.level_1;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();

        int result = firstNumber + twoNumber;
        System.out.println("Мой результат = " + result);

    }
}
