package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_1;


import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
System.out.println("Please enter first number and press 'Enter'");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number and press 'Enter'");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int divideResult = firstNumber / secondNumber;

        System.out.println("Sum result:" + sumResult);
        System.out.println("Subtract result:" + subtractResult);
        System.out.println("Multiply result:" + multiplyResult);
        System.out.println("Divide result:" + divideResult);

    }
}
