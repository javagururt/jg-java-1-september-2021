package com.javaguru.student_Vladislav_Pipirin.lesson_2.level_2;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя объект Scanner
//следующим образом:
//
//    Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите первое число: ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println(" Введите второе число: ");
        double secondDoubleNumber = scanner.nextDouble();
        double sumNumber = firstDoubleNumber + secondDoubleNumber;
        double subtractNumber = firstDoubleNumber - secondDoubleNumber;
        double multiplyNumber = firstDoubleNumber * secondDoubleNumber;
        double divideNumber = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Сумма: " + sumNumber);
        System.out.println("Вычитание: " + subtractNumber);
        System.out.println("Умножение: " + multiplyNumber);
        System.out.println("Деление: " + divideNumber);


    }




}
