package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_8 {
    public static void main(String[] args) {
        System.out.println("Please enter user name and press 'Enter'");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println(" Hello " + userName);

    }
}
