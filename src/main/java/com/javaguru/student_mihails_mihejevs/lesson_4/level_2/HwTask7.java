package com.javaguru.student_mihails_mihejevs.lesson_4.level_2;

import java.util.Scanner;

public class HwTask7 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter two whole number.");
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("\"Numbers are equals\"");
        } else {
            System.out.println("\"Numbers are different\"");
        }
    }
}

