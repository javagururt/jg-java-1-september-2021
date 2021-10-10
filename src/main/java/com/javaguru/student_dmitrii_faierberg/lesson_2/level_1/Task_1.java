package com.javaguru.student_dmitrii_faierberg.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Please, enter two integers:");
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " +
                (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " +
                (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " +
                (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " +
                (firstNumber / secondNumber));
    }
}
