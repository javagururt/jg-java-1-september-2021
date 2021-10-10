package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = input.nextInt();

        System.out.println("Сложение = " + (firstNumber+secondNumber));
        System.out.println("Вычитание = " + (firstNumber-secondNumber));
        System.out.println("Умножение = " + (firstNumber*secondNumber));
        System.out.println("Деление = " + (firstNumber/secondNumber));


    }
}
