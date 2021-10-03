package com.javaguru.student_jekaterina_ola.lesson_2.Task_1;

import java.util.Scanner;

public class sumSubtractMultiplyDivideInt {

    public static main(String[] args){
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = intput.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int divideResult = firstNumber / secondNumber;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiply Result: " + multiplyResult);
        System.out.println("Divide Result: " + divideResult);

    }
}
