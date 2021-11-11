package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class ShapeService {

    public double sumArea(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            // i = 0 - Square
            // i = 1 - Rectangle
            // i = 2 - Circle
            // i = 3 - Square
            result = result + shape.calculateArea();
        }
        return result;
    }
}
