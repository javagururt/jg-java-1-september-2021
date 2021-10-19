package com.javaguru.student_jekaterina_ola.lesson_4.level_2_intern.Task_6;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наименьшее из них.*/

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two whole numbers.");
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Smallest result: " + firstNumber);
        } else {
            System.out.println("Smallest result: " + secondNumber);
        }
    }
}