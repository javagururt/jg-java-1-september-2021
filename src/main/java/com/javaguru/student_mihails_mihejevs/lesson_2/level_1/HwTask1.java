package com.javaguru.student_mihails_mihejevs.lesson_2.level_1;
/*
        Написать консольную программу, которая запрашивает у пользователя два целых числа и
        выводит на консоль результаты: сложения, вычитания, умножения и деления.
*/

// Прошу мои домашки оценивать максимально критично. Спс.

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class HwTask1 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter two number. ");
        System.out.println("first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("second number: ");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int divideResult = firstNumber / secondNumber;
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Sum: " + sumResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Multiply: " + multiplyResult);

    }
}
