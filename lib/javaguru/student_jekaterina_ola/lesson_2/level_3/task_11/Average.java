package com.javaguru.student_jekaterina_ola.lesson_2.level_3.task_11;

//Напишите программу, которая запрашивает у пользователя
//        три целых числа и выводит их среднее арифметическое
//        (складывает все числа и делит на их количество).

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = input.nextInt();

        double averageMeanResult = (firstNumber + secondNumber + thirdNumber) /3;
        System.out.println("Average Arithmetical Result: " + averageMeanResult);
            }
}
