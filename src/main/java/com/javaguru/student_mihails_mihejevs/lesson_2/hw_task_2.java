package com.javaguru.student_mihails_mihejevs.lesson_2;
/*
Написать консольную программу, которая запрашивает у пользователя два вещественных числа
        (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
        Вещественные числа можно запрашивать с консоли используя объект Scanner
        следующим образом:

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
*/

import java.util.Scanner;

public class hw_task_2 {
    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter two number.");
        System.out.println("first number: ");
        Scanner input = new Scanner (System.in);
        double firstDoubleNumber = input.nextDouble();
        System.out.println("second number: ");
        double secondDoubleNumber = input.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtractResult = firstDoubleNumber - secondDoubleNumber;
        double divideResult = firstDoubleNumber / secondDoubleNumber;
        double multiplyResult = firstDoubleNumber * secondDoubleNumber;

        System.out.printf("Sum: " + "%.2f\n", sumResult);
        System.out.printf("Subtract: " + "%.2f\n", subtractResult);
        System.out.printf("Divide: " + "%.2f\n", divideResult);
        System.out.printf("Multiply: " + "%.2f\n", sumResult);

    }
 }