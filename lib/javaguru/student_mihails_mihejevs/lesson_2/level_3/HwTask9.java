package com.javaguru.student_mihails_mihejevs.lesson_2.level_3;
/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class HwTask9 {
    public static void main(String[] args) {
        System.out.println("Hello, enter the number: ");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        int multiply2 = number * 2;
        int multiply3 = number * 3;
        int multiply4 = number * 4;
        int multiply5 = number * 5;
        int multiply6 = number * 6;
        int multiply7 = number * 7;
        int multiply8 = number * 8;
        int multiply9 = number * 9;
        int multiply10 = number * 10;

        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + multiply2);
        System.out.println(number + " x 3 = " + multiply3);
        System.out.println(number + " x 4 = " + multiply4);
        System.out.println(number + " x 5 = " + multiply5);
        System.out.println(number + " x 6 = " + multiply6);
        System.out.println(number + " x 7 = " + multiply7);
        System.out.println(number + " x 8 = " + multiply8);
        System.out.println(number + " x 9 = " + multiply9);
        System.out.println(number + " x 10 = " + multiply10);

    }
}