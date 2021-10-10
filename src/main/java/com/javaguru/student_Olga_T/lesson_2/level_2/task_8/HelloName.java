package com.javaguru.student_Olga_T.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        System.out.println("Hello, " + username + ("!"));

    }
}
