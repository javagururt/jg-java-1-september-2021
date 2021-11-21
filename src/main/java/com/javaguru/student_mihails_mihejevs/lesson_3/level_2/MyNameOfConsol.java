package com.javaguru.student_mihails_mihejevs.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class MyNameOfConsol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String inputName = scanner.nextLine();
        System.out.println("Hello " + inputName + "!");
    }
}
