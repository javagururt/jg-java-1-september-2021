package com.javaguru.student_jekaterina_ola.lesson_4.level_2_intern.Task_7;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль:
        - "Numbers are equals" - если числа равны
        - "Numbers are different" - если числа не равны*/

import java.util.Scanner;

public class EqualDifferentNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two whole numbers.");
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Equal numbers." );
        } else {
            System.out.println("Different numbers." );
        }
    }
}
