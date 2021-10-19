package com.javaguru.student_jekaterina_ola.lesson_4.level_1_intern.Task_1;
//Написать программу, которая запрашивает у
//        пользователя
//        целое число и выводит на консоль
//        положительное оно или отрицательное.


import java.util.Scanner;

public class numberInput {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number is equal to zero");
        } else if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
