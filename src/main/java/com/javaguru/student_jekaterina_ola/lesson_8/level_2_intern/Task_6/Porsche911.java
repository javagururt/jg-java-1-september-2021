package com.javaguru.student_jekaterina_ola.lesson_8.level_2_intern.Task_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Porsche911 extends Car {

    private int topSpeed;

    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

}
