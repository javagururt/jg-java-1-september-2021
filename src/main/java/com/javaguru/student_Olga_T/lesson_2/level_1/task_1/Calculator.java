package com.javaguru.student_Olga_T.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Введите второе целое число");
        int secondNumber = input.nextInt();

        System.out.println("Сумма двух чисел (" + firstNumber + " и " + secondNumber + ") равна: " + (firstNumber + secondNumber));
        System.out.println("Разница двух чисел (" + firstNumber + " и " + secondNumber + ") равна: " + (firstNumber - secondNumber));
        System.out.println("Произведение двух чисел (" + firstNumber + " и " + secondNumber + ") равна: " + (firstNumber * secondNumber));
        System.out.println("Результат деления двух чисел (" + firstNumber + " и " + secondNumber + ") равен: " + (firstNumber / (double) secondNumber));
    }
}
