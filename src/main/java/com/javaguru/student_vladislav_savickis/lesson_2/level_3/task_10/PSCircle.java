package com.javaguru.student_vladislav_savickis.lesson_2.level_3.task_10;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class PSCircle {
    public static void main(String[] args) {
        double Pi = 3.14;
            System.out.println("Bonjour! Please enter double number: ");
            Scanner input = new Scanner(System.in);
            double radius = input.nextDouble();
            double perimeter = 2 * Pi * radius;
            System.out.println("Perimeter of circle with radius " + radius + " = " + perimeter);
            double area = Pi * (radius * radius);
            System.out.println("Area of circle with radius " + radius + " = " + area);
    }
}
