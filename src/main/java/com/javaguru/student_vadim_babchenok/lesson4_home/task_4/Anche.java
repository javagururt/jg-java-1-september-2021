package com.javaguru.student_vadim_babchenok.lesson4_home.task_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя целое число и выводит на консоль чётное оно или нет.
        Подсказка: используйте для определения чётное число или нет
        операцию остаток от деления (%). Если остаток от деления на 2 равен нулю то число чётное, иначе не чётное.*/
@CodeReview(approved = true)
public class Anche {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число - будет указанно оно чётное или не чётное");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0 ){
            System.out.println("Это число чётное");
        }
        else {
            System.out.println ("Это число не чётное");
        }
    }
}
