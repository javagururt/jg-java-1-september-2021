package com.javaguru.student_dmitrii_faierberg.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.print("Your name is: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
