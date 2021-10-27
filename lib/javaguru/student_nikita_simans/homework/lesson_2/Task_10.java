package com.javaguru.student_nikita_simans.homework.lesson_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {

    public static void main(String[] args) {
        System.out.println("Enter radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double perimeter = radius * 2 * 3.14;
        double area = 3.14 * (radius * radius);

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = : " + area);


    }
}
