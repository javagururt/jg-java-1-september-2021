package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_x;
/* Исправьте ошибки компиляции в данной программе.

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

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Super_task_3 {
    public static void main(String[] args) {
        System.out.println("Please enter first number (0) : ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

        System.out.println("Please enter second number (0.00): ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        System.out.println("Sum = " + sum);

        System.out.print("First number was :" + number1);
        System.out.println("; Second number was :" + number2);
    }
}
