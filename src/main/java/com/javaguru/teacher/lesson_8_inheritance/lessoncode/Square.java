package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
