package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

public class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea() { return sideA * sideB; }
    double calculatePerimeter() { return (sideA + sideA) * 2; }
}
