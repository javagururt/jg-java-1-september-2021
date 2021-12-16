package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    double calculatePerimeter() { return sideA * 3; }
}
