package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class L2Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        double firstNum = input.nextDouble();
        System.out.println("Please enter second number: ");
        double secondNum = input.nextDouble();

        double sumResult = firstNum + secondNum;
        double subtractResult = firstNum - secondNum;
        double multiplyResult = firstNum * secondNum;
        double divideResult = firstNum / secondNum;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiply result: " + multiplyResult);
        System.out.println("Divide result: " + divideResult);

    }
}
