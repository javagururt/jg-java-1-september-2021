package com.javaguru.student_maksims_jagelavics.lesson_2.homework;

import java.util.Scanner;

public class Task_1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter first number:");
            int firstNumber = input.nextInt();
            System.out.println("Please enter second number:");
            int secondNumber = input.nextInt();
            int sumResult = firstNumber + secondNumber;
            int subtractResult = firstNumber - secondNumber;
            int multiplyResult = firstNumber * secondNumber;
            int divideResult = firstNumber / secondNumber;
            System.out.println("Sum result: " + sumResult);
            System.out.println("Subtract result: " + subtractResult);
            System.out.println("Multiply result: " + multiplyResult);
            System.out.println("Divide result: " + divideResult);
        }

}

