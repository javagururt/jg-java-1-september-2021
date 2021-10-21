package com.javaguru.student_vadim_babchenok.lesson4_home.task_9;

import java.util.Scanner;

/*
Write a program that accepts three numbers from the user and prints:
        - "increasing" if the numbers are in increasing order,
        - "decreasing" if the numbers are in decreasing order,
        - "Neither increasing or decreasing order" otherwise.

*/
public class SmartDifference {
    public static void main(String[] args) {
        System.out.println("Enter three numbers and press start!");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third int number:");
        int thirdNumber = input.nextInt();
        String result;

        if (firstNumber < secondNumber && secondNumber < thirdNumber ) {
            result = "Number " + "increasing";
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber ) {
            result = "Number " + "decreasing";
        } else {
            result = "Number " + "Neither increasing or decreasing order";
        }

        System.out.println(result);
    }
}
