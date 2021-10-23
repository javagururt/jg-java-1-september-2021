package com.javaguru.student_Olga_T.lesson_4.level_4.tasks_11_15;

import java.util.Scanner;

class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner inputNumber = new Scanner(System.in);
        float firstNumber = inputNumber.nextInt();
        System.out.println("Please enter second number: ");
        float secondNumber = inputNumber.nextInt();

        Calculator calculator = new Calculator();

        System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.numbersAddition(firstNumber, secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.numbersSubtraction(firstNumber, secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.numbersMultiplication(firstNumber, secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.numbersDivision(firstNumber, secondNumber));

        if (calculator.isEven(firstNumber)) {
            System.out.println(firstNumber + " is even.");
        } else {
            System.out.println(firstNumber + " is odd.");
        }


        if (calculator.maxOfTwoNumbers(firstNumber, secondNumber) == -10000000) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("The largest number is: " + calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        }
    }
}

