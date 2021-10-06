package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = input.nextInt();
        System.out.println("Введите третье число: ");
        int thirdNumber = input.nextInt();

        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Среднее арифметическое = " +average);

    }
}

