//Написать программу, которая запрашивает у пользователя
//        целое число и выводит на консоль чётное оно или нет.
//
//        Подсказка: используйте для определения чётное число или нет
//        операцию остаток от деления (%). Если остаток от деления на 2
//        равен нулю то число чётное, иначе не чётное.


package com.javaguru.student_rodions_sokolovs.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("the number is even : " + number);
        } else {
            System.out.println("The number isn't even: " + number);
        }
    }
}
