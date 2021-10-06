package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_3;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class L2Task10 {

    public static final double PI = 3.1415926536; // пример константы

    public static void main(String[] args) {
        System.out.println("Введите радиус круга: ");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        //название все равно должно быть с маленькой буквы, если это не константа. Константы создаются подругому.
        //double Pi = 3.1415926536;
        double perimeter = 2 * PI * num;
        double area = PI * num * num;

        System.out.println("Длина окружности = " + perimeter);
        System.out.println("Площадь круга = " + area);
    }
}