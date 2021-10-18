package com.javaguru.student_mihails_mihejevs.lesson_4.level_3_junior;

import java.util.Scanner;

public class HwTask10 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter three whole number.");
        System.out.println("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber >= secondNumber & secondNumber >= thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber >= firstNumber & secondNumber >= thirdNumber ) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
