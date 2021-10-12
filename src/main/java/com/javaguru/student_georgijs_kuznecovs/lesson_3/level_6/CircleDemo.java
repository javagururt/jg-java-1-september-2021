package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import java.util.Scanner;

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
