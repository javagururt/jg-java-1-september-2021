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

package com.javaguru.student_rodions_sokolovs.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Level_3_10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Напишите радиус круга:");
            double radius = scanner.nextDouble();
            double PI = 3.14159265359;
            double perimeter = PI * (radius * 2);
            double area = PI * (radius * radius);

            System.out.println("Периметр = " + perimeter);
            System.out.println("Площадь = " + area);
        }
    }

