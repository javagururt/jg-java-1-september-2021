package com.javaguru.student_vladislav_savickis.lesson_2.level_1.task_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class SumSubtractMultiplyDivideInt {

    public static void main(String[] args) {
        System.out.println("Good day, sir! Now you will solve int equations. Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int divideResult = firstNumber / secondNumber;
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Divide result: " + divideResult);
        System.out.println("Multiply result: " + multiplyResult);
    }
}
