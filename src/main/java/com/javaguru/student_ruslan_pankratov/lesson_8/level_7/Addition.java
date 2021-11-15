package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;


class Addition extends TwoArgumentMathOperation {

    public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() + calculateRightSide();
    }
}