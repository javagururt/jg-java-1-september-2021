package com.javaguru.student_vladislav_savickis.lesson_2.level_1.task_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class SumSubtractMultiplyDivideDouble {
    public static void main(String[] args) {
        System.out.println("Good day, sir! Now you will solve double equations. Please enter first number: ");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        System.out.println("Please enter second number: ");
        double secondNumber = input.nextDouble();

        double sumResult = firstNumber + secondNumber;
        double subtractResult = firstNumber - secondNumber;
        double divideResult = firstNumber / secondNumber;
        double multiplyResult = firstNumber * secondNumber;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Divide result: " + divideResult);
        System.out.println("Multiply result: " + multiplyResult);
    }
}
