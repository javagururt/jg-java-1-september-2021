package com.javaguru.student_vladislav_savickis.lesson_1.task_11;

import java.util.Scanner;

public class sumDivide {
    public static void main(String[] args) {
        System.out.println("Hello! Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int divideResult = firstNumber / secondNumber;

            System.out.println("Sum result: " + sumResult);
            System.out.println("Divide result: " + divideResult);
    }
}
