package com.javaguru.student_vladislav_savickis.lesson_2.Task_11;

import java.util.Scanner;

public class averageOfNumbers {
    public static void main(String[] args) {
        System.out.println("Bonjour! Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = input.nextInt();
        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average of " + firstNumber + " " + secondNumber + " " + thirdNumber + " = " + average);
    }
}
