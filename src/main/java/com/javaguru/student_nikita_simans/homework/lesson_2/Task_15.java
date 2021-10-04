package com.javaguru.student_nikita_simans.homework.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("User authorization");

        System.out.print("Login: ");
        Scanner input = new Scanner(System.in);
        String login = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        System.out.println("Hello, " + login + "!");
    }
}
