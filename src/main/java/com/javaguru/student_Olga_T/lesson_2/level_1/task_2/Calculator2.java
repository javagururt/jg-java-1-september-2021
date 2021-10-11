package com.javaguru.student_Olga_T.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Сумма двух чисел (" + firstDoubleNumber + " и " + secondDoubleNumber + ") равна: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Разница двух чисел (" + firstDoubleNumber + " и " + secondDoubleNumber + ") равна: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Произведение двух чисел (" + firstDoubleNumber + " и " + secondDoubleNumber + ") равна: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Результат деления двух чисел (" + firstDoubleNumber + " и " + secondDoubleNumber + ") равен: " + (firstDoubleNumber / secondDoubleNumber));

    }

}
