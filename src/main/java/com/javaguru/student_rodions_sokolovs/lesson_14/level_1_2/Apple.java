package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Apple {
    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}


