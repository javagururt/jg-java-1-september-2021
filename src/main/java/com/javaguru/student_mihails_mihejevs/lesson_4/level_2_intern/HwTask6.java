package com.javaguru.student_mihails_mihejevs.lesson_4.level_2_intern;

import java.util.Scanner;

public class HwTask6 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter two whole number.");
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println();

        if (firstNumber < secondNumber) {
            System.out.println("Fewer: " + firstNumber);
        } else {
            System.out.println("Fewer: " + secondNumber);
        }
    }
}
