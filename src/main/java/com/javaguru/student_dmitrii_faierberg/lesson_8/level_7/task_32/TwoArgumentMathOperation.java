package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class TwoArgumentMathOperation extends MathOperation {

	private MathOperation leftArgument;
	private MathOperation rightArgument;

	public TwoArgumentMathOperation(MathOperation leftArgument,
                                    MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}
