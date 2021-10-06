package com.javaguru.student_vladislav_savickis.lesson_2.level_2.task_8;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Username {
    public static void main(String[] args) {
        System.out.println("Hoi! Please enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}

