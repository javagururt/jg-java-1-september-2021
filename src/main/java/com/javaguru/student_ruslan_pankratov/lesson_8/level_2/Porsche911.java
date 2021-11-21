package com.javaguru.student_ruslan_pankratov.lesson_8.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_6
@CodeReview(approved = true)
public class Porsche911 extends Car{
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
