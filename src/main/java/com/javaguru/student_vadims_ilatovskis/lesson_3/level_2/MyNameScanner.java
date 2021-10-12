package com.javaguru.student_vadims_ilatovskis.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class MyNameScanner {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        System.out.println("Hi " + userName + " !");
    }
}
