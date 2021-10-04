package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_10 {
    public static void main(String[] args) {
        System.out.println("Please enter radius and press 'Enter'");
        Scanner input = new Scanner(System.in);
        double userNumber = input.nextDouble();
        double diameter = userNumber * 2;
        double perimeter = 3.14 * diameter;
        double area = 3.14 * (userNumber * userNumber);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
