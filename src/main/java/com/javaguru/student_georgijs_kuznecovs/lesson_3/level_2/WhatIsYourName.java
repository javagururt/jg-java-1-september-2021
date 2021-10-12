package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class WhatIsYourName {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        System.out.println("Hello " + userName + "!");

    }
}
