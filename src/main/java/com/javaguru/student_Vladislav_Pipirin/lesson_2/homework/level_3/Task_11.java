package com.javaguru.student_Vladislav_Pipirin.lesson_2.homework.level_3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter three numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        double averageResult = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.println(" average =  " + averageResult);

    }
}
