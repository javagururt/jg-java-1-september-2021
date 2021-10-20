package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_3_junior;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Hi! Please enter first int number:");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int thirdNumber = input.nextInt();

        if (firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber) {
            if (firstNumber > secondNumber || firstNumber > thirdNumber) {
                System.out.println("Number " + firstNumber + " is largest");
            } else if (secondNumber > firstNumber || secondNumber > thirdNumber) {
                System.out.println("Number " + secondNumber + " is largest");
            } else if (thirdNumber > secondNumber || thirdNumber > firstNumber) {
                System.out.println("Number " + thirdNumber + " is largest");
            } else {
                System.out.println("Numbers are equal");
            }
        } else {
            if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                System.out.println("Number " + firstNumber + " is largest");
            } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println("Number " + secondNumber + " is largest");
            } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
                System.out.println("Number " + thirdNumber + " is largest");
            } else {
                System.out.println("Numbers are equal");
            }
        }
    }
}
