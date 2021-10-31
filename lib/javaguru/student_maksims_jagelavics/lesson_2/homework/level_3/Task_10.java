package com.javaguru.student_maksims_jagelavics.lesson_2.homework.level_3;

//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Locale;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please enter circle radius:");
        double circleRadius = input.nextDouble();
        double circlePerimeter = 2 * Math.PI * circleRadius;
        double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.println("Perimeter is: " + circlePerimeter);
        System.out.println("Area is: " + circleArea);
    }

}
