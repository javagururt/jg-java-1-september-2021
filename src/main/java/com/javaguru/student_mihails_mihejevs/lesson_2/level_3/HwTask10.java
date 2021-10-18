package com.javaguru.student_mihails_mihejevs.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
@CodeReview(approved = true)
public class HwTask10 {
        public static void main(String[] args) {
            System.out.println("Radius is = ");
            Scanner input = new Scanner (System.in);
            double radius = input.nextDouble();
            double pi = 3.14;

            double perimetr = 2 * pi * radius;
            double area = pi * radius * radius;

            System.out.println("Perimetr is " + perimetr);
            System.out.println("Area is " + area);

        }


}
