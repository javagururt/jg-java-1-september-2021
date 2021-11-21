package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

class Division extends TwoArgumentMathOperation{
    public Division(MathOperation leftArgument,
                          MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
