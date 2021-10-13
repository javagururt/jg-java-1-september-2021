package com.javaguru.student_deniss_lohins.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class NameScannerFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter user name: ");
        String userName = input.nextLine();
        System.out.println("Hello " + userName);
    }
}
