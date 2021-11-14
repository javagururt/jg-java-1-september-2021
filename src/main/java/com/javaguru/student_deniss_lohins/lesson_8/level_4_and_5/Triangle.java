package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

class Triangle extends Shape{

    double sideA;
    double sideB;
    double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
