package com.javaguru.student_vladislav_savickis.lesson_2.level_2.task_8;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Username {
    public static void main(String[] args) {
        System.out.println("Hoi! Please enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}

