package com.javaguru.student_jekaterina_ola.lesson_2.Task_1;

import java.util.Scanner;

public class sumSubtractMultiplyDivideInt {

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int divideResult = firstNumber / secondNumber;

        System.out.println("sumResult: " + sumResult);
        System.out.println("subtractResult: " + subtractResult);
        System.out.println("multiplyResult: " + multiplyResult);
        System.out.println("divideResult: " + divideResult);
    }
}
