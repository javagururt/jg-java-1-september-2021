package com.javaguru.teacher.lesson_2.lessoncode;

import com.javaguru.teacher.review.CodeReview;
import com.javaguru.teacher.review.CodeReviewComment;

import java.util.Scanner;

@CodeReviewComment(teacher = "test")
@CodeReview(approved = true)
public class UserInputExample {

    public static void main(String[] args) {
        System.out.println("Hello! Please enter first number: ");
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
