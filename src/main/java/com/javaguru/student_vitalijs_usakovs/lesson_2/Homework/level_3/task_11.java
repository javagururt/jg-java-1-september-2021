package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_3;

import java.util.Scanner;
/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */
public class task_11 {
    public static void main(String[] args){
        System.out.println("Введите 1-ое число : ");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        System.out.println("Введите 2-ое число : ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        System.out.println("Введите 3-ие число : ");
        Scanner input3 = new Scanner(System.in);
        int num3 = input3.nextInt();

        int result1 = (num1 + num2 + num3) / 3;

        System.out.println("Среднее арифметическое : " + result1);
    }
}
