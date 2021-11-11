package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }
}
