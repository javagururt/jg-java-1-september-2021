package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Please enter radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        circle.radius = radius;

        System.out.println(circle.calculateArea(circle.radius));


    }
}
