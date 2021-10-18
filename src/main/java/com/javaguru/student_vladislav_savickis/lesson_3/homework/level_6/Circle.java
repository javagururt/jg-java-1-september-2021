package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

class Circle {
    private double radius;

    Circle(double circleRadius) {
        this.radius = circleRadius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
