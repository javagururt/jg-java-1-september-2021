package com.javaguru.student_ruslan_pankratov.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваше имя в консоле:");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}