package com.javaguru.student_mihails_mihejevs.lesson_2.level_3;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class HwTask11 {

    public static void main (String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter three numbers. ");
        System.out.println("first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("second number: ");
        int secondNumber = input.nextInt();
        System.out.println("third number: ");
        int thirdNumber = input.nextInt();
        int arithmeticalMeanResult = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Arithmetical mean: " + arithmeticalMeanResult);
    }
}
