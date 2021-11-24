package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
