package com.javaguru.student_maksims_jagelavics.lesson_2.homework.level_3;

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = input.nextInt();
        double average = (double)(firstNumber + secondNumber + thirdNumber)/3;
        System.out.println("Average result: " + average);
        }

}
