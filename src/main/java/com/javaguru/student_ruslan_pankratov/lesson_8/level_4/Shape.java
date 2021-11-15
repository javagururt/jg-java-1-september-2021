package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

//Task_15-16
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
