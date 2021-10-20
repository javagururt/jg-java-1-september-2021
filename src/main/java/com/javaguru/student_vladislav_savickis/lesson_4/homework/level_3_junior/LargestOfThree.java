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

        int result;

        if (firstNumber < secondNumber) {
            result = secondNumber;
        } else if (secondNumber < thirdNumber) {
            result = thirdNumber;
        } else {
            result = firstNumber;
        }
        System.out.println("Number " + result + " is largest");
    }
}
