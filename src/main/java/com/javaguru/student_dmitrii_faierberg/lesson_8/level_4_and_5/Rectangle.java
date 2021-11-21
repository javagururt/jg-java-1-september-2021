package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

class Rectangle extends Shape {
    double sideA, sideB;
    Rectangle(String title, double sideA, double sideB){
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    double calculateArea() {
        return sideB * sideA;
    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
