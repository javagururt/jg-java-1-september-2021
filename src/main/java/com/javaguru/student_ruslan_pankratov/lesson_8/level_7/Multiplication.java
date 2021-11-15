package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;

public class Multiplication extends TwoArgumentMathOperation{


    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
