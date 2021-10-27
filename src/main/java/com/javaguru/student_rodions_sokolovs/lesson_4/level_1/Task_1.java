//Написать программу, которая запрашивает у
//        пользователя
//        целое число и выводит на консоль
//        положительное оно или отрицательное.
//Написать программу, которая запрашивает у пользователя
//        целое число и выводит на консоль
//        положительное оно, отрицательное или равно нулю.

//TASK 1-2
package com.javaguru.student_rodions_sokolovs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number!: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else {
            System.out.println("Number = 0");
        }

    }
}
