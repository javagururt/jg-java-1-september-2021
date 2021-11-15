package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;


class Argument extends MathOperation {

    private double argument;

    public Argument(double argument) {
        this.argument = argument;
    }

    @Override
    public double calculate() {
        return argument;
    }
}
