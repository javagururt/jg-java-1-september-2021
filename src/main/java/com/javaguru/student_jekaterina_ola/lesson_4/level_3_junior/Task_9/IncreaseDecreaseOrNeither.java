package com.javaguru.student_jekaterina_ola.lesson_4.level_3_junior.Task_9;

/*Write a program that accepts three numbers from the user and prints:
        - "increasing" if the numbers are in increasing order,
        - "decreasing" if the numbers are in decreasing order,
        - "Neither increasing or decreasing order" otherwise.*/

import java.util.Scanner;

public class IncreaseDecreaseOrNeither {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree){
            System.out.println("Increasing order.");
        } else if (numberOne > numberTwo && numberTwo > numberThree){
            System.out.println("Decreasing order.");
        } else {
            System.out.println("Neither increasing or decreasing order.");
        }
    }
}
