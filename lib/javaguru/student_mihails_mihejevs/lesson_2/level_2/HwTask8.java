package com.javaguru.student_mihails_mihejevs.lesson_2.level_2;
/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
 */


import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class HwTask8 {
    public static void main(String[] args) {
        System.out.println("Hello, Your name is: ");
        Scanner input = new Scanner (System.in);
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
