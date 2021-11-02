package com.javaguru.student_jekaterina_ola.lesson_4.level_3_junior.Task_10;

/*Написать программу, которая запрашивает у пользователя
        три целых числа и выводит на консоль наибольшее из них.

        PS: перед решением этой задачи распишите на бумаге
        или в комментарии все возможные варианты (комбинации).
        Это поможет вам правильно написать программу!
        Нельзя пользоваться классом Math.*/

import java.util.Scanner;

public class GreatestNumberCombinations {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three whole numbers.");
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Greatest result: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Greatest result: " + secondNumber);
        }else {
            System.out.println ("Greatest result: " + thirdNumber);
        }

    }
}

