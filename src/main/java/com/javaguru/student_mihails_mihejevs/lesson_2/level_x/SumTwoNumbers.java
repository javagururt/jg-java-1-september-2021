package com.javaguru.student_mihails_mihejevs.lesson_2.level_x;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте ошибки компиляции в данной программе.

public class SumTwoNumbers {

	public static void main(String[] args) {

		int numberOne;
		int numberTwo;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		int numberOne = 10;
		int numberTwo = 20;

		int sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}
}
 */
@CodeReview(approved = true)
public class SumTwoNumbers {
    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        numberOne = 10;
        numberTwo = 20;
            System.out.println("Number 1 = " + numberOne);
            System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;
            System.out.println("Sum = " + sum);
    }
}
