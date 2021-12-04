package com.javaguru.student_dmitrii_faierberg.lesson_8.level_2.car;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Porsche911 extends Car {

    private int topSpeed;

    Porsche911(int releaseYear, int topSpeed){
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
    // создайте конструктор

}