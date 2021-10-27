package com.javaguru.student_nikita_simans.homework.lesson_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class StringFromTerminal {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
