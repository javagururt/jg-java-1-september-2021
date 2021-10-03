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
        System.out.println("First number: ");
        Scanner input = new Scanner (System.in);
        double firstDoubleNumber = input.nextDouble();
        System.out.println("second number: ");
        double secondDoubleNumber = input.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtractResult = firstDoubleNumber - secondDoubleNumber;
        double divideResult = firstDoubleNumber / secondDoubleNumber;
        double multiplyResult = firstDoubleNumber * secondDoubleNumber;

        System.out.printf("%.2f", sumResult);
        System.out.println(" - Sum");
        System.out.printf("%.2f", subtractResult);
        System.out.println(" - Subtract");
        System.out.printf("%.2f", divideResult);
        System.out.println(" - Divide");
        System.out.printf("%.2f", multiplyResult);
        System.out.println(" - Multiply");
    };
 }