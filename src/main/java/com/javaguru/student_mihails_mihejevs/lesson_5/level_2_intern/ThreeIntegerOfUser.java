package com.javaguru.student_mihails_mihejevs.lesson_5.level_2_intern;
/*
Task_11
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
import java.util.Scanner;

public class ThreeIntegerOfUser {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter three number. ");
        System.out.println("first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("second number: ");
        int secondNumber = input.nextInt();
        System.out.println("third number: ");
        int thirdNumber = input.nextInt();

        int[] threeIntegerOfUser = new int[3];
        threeIntegerOfUser[0] = firstNumber;
        threeIntegerOfUser[1] = secondNumber;
        threeIntegerOfUser[2] = thirdNumber;

        for (int i = 0; i < threeIntegerOfUser.length; i++) {
            System.out.println(threeIntegerOfUser[i]);
        }
    }
}
