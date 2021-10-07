package com.javaguru.student_Olga_T.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = number.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = number.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = number.nextInt();

        System.out.println("Inputed numbers are: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);
        System.out.println("The average of numbers " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is: " + (firstNumber + secondNumber + thirdNumber) / (double)3);

    }
}
