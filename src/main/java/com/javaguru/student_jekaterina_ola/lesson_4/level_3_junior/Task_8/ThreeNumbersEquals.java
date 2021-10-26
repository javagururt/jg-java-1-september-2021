package com.javaguru.student_jekaterina_ola.lesson_4.level_3_junior.Task_8;

/*Write a Java program that accepts three numbers and prints:
        - "All numbers are equal" if all three numbers are equal,
        - "All numbers are different" if all three numbers are different
        - "Neither all are equal or different" otherwise.*/

import java.util.Scanner;

public class ThreeNumbersEquals {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree){
            System.out.println("All numbers are equal.");

        } else if ((numberOne == numberTwo) || (numberOne == numberThree) || (numberThree == numberTwo)){
            System.out.println("Neither all are equal or different");

        } else {
            System.out.println("All numbers are different.");
        }
    }
}
