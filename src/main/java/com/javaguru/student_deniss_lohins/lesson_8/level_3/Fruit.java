package com.javaguru.student_deniss_lohins.lesson_8.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Fruit {
    public Fruit(String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    private String colour;
    private double weight;

}
