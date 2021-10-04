package com.javaguru.student_Deniss_Lohins.lesson_2.level_5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        int mean = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Mean value is " + mean);
    }
}
