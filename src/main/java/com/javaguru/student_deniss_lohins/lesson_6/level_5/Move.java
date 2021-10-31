package com.javaguru.student_deniss_lohins.lesson_6.level_5;

class Move {
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
