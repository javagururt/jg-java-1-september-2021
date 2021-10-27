package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson4_home.Task2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        целое число и выводит на консоль
        положительное оно, отрицательное или равно нулю.*/
@CodeReview(approved = true)
public class DifferenceSeconda {
    public static void main(String[] args) {
        System.out.println("Введи любое целое число");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if ( number >0){
            System.out.print("Это число положительное");
        }else if (number<0){
            System.out.print("Это число отрицательное");
        } else {
            System.out.print("Ты ввёл ноль");
        }


    }

    }

