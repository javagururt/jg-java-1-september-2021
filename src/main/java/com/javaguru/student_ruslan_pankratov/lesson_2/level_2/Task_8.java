package com.javaguru.student_ruslan_pankratov.lesson_2.level_2;


import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
