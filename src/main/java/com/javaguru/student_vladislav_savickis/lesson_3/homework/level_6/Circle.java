package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

public class Circle {
    private double radius;

    Circle(double circleRadius) {
        this.radius = circleRadius;
    }

    public double calculateArea() {
        double pi = 3.14;
        return pi * (radius * radius);
    }
}
