//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!


package com.javaguru.student_rodions_sokolovs.lesson_2.level_2;


import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Level_2_8 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();
        System.out.println("Hello! " + firstname);
    }
}
