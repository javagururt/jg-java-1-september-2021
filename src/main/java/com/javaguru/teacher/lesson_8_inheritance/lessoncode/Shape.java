package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double calculateArea();

}
