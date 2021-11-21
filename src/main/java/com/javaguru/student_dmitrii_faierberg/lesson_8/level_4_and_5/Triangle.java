package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    Triangle(String title, double sideA, double sideB, double sideC){
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        return (sideA * sideA * Math.pow(3, 0.5)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return sideA * 3;
    }
}
