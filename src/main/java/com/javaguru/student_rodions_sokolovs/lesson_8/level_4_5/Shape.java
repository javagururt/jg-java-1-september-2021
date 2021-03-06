package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}