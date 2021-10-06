//Написать консольную программу, которая запрашивает у пользователя два целых числа
//и выводит на консоль результаты: сложения, вычитания, умножения и деления.

package com.javaguru.student_rodions_sokolovs.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Level_1_1 {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstnum = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondnum = input.nextInt();

        int sumres = firstnum + secondnum;
        int subtrac = firstnum - secondnum;
        int divideres = firstnum / secondnum;
        int multiplyres = firstnum * secondnum;

        System.out.println("Sum result: " + sumres);
        System.out.println("Subtract result: " + subtrac);
        System.out.println("Divide result: " + divideres);
        System.out.println("Multiply result: " + multiplyres);

    }
}