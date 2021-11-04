package com.javaguru.student_mihails_mihejevs.lesson_2.level_x;
/*
Исправьте ошибки компиляции в данной программе.

public class CorrectDataTypes {

	public static void main(String[] args) {

		int numberOne = 10;
		double numberTwo = 20.0;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		float sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}
 */
public class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;
            System.out.println("Number 1 = " + numberOne);
            System.out.println("Number 2 = " + numberTwo);

        double sum = (double) numberOne + numberTwo;
            System.out.println("Sum = " + sum);
    }
}
