package com.javaguru.student_ruslan_pankratov.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите радиус вашего круга:");

        double radius = scanner.nextDouble();
        double perimeter = Math.abs(Math.PI * (radius * 2));
        double area = Math.abs(Math.PI * (radius * radius));

        System.out.println("Периметр вашего круга = " + perimeter);
        System.out.println("Площадь вашего круга = " + area);
    }
}
