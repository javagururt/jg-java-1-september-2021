package com.javaguru.student_jekaterina_ola.lesson_2.Level_2.Task_8;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class UserName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName= input.nextLine();
        System.out.println("Hello " + userName);
    }
}
