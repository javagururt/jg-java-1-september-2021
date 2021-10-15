package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        circle.radius = 10;
        System.out.println(circle.calculateArea());
    }
}
