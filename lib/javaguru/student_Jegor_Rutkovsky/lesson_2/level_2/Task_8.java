package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        Scanner myName = new Scanner(System.in);
        String name = myName.nextLine();

        System.out.println("Your name is " + name);
    }
}
