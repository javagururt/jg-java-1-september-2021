package com.javaguru.student_dmitrii_faierberg.lesson_6.level_5_and_level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Move {
    private int x;
    private int y;

    Move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
