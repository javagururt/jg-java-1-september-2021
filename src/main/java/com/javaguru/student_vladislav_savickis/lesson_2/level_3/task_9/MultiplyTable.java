package com.javaguru.student_vladislav_savickis.lesson_2.level_3.task_9;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class MultiplyTable {
    public static void main(String[] args) {
            System.out.println("Bonjour! Please enter int number: ");
            Scanner input = new Scanner(System.in);
            int firstNumber = input.nextInt();
        System.out.println("Multiplying table for number ");
            for (int i = 1; i < 11; i++) {
                int multiplyResult = firstNumber * i;
                System.out.println(firstNumber + " * " + i + " = " + multiplyResult);
            }
    }
}
