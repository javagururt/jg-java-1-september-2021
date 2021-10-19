package com.javaguru.student_jekaterina_ola.lesson_4.level_2_intern.Task_5;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наибольшее из них.
        Нельзя пользоваться классом Math, можно использовать только if else.*/

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two whole numbers.");
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Greatest result: " + firstNumber);
        } else {
            System.out.println("Greatest result: " + secondNumber);
        }
    }
}
