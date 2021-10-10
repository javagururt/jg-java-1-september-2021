package com.javaguru.student_jekaterina_ola.level_1.Task_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){
        System.out.println("Please enter first number");
        Scanner input = new Scanner (System.in);
        double firstNumber=input.nextDouble();
        System.out.println("Please enter second number");
        double secondNumber=input.nextDouble();

        double sumResult = firstNumber + secondNumber;
        double subtractResult = firstNumber - secondNumber;
        double multiplyResult = firstNumber * secondNumber;
        double divideResult = firstNumber / secondNumber;

        System.out.println("Sum Result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiply Result: " + multiplyResult);
        System.out.println("Divide Result: " + divideResult);

    }
}
