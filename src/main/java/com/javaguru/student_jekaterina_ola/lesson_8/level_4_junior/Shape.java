package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

//Объявите в классе Shape абстрактный метод
//        для подсчёта периметра.
@CodeReview(approved = true)
public abstract class Shape {
    private String title;

    Shape(String title) { this.title = title; }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

