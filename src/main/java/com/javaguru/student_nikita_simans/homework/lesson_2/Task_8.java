package com.javaguru.student_nikita_simans.homework.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please, enter name:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + "!");
    }
}
