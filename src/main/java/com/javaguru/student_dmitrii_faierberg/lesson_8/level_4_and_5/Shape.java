package com.javaguru.student_dmitrii_faierberg.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
