package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

class Circle {

    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return pi * this.radius * this.radius;
    }
}
