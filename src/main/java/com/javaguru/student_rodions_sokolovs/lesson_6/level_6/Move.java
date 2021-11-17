package com.javaguru.student_rodions_sokolovs.lesson_6.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Move {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x-1;
        this.y = y-1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
