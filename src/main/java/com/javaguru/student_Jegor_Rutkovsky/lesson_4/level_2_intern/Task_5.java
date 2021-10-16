package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner1.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Greatest number is " +firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Greatest number is " +secondNumber);
        } else {
            System.out.println("Numbers are equals");
        }
    }
}



