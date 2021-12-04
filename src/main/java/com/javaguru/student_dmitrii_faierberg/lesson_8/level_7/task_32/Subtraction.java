package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

