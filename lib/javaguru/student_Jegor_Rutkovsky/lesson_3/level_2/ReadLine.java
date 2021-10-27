package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class ReadLine {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner yourName = new Scanner(System.in);
        String name = yourName.nextLine();
        System.out.println("Hello, "+name);
    }
}
