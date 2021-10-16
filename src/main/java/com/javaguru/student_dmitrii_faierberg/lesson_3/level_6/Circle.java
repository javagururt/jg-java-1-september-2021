package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
