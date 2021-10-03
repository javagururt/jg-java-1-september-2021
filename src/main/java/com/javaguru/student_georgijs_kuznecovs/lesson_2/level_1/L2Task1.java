package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_1;

import java.util.Scanner;

public class L2Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("PLease enter second number: ");
        int secondNum = input.nextInt();

        int sumResult = firstNum + secondNum;
        int subtractResult = firstNum - secondNum;
        int multiplyResult = firstNum * secondNum;
        int divideResult = firstNum / secondNum;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiply result: " + multiplyResult);
        System.out.println("Divide result: " + divideResult);

    }
}
