package com.javaguru.student_jekaterina_ola.lesson_2.Task_1;

import com.javaguru.teacher.review.CodeReview;
import com.javaguru.teacher.review.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Название класса должно начинаться с заглавной буквы.")
public class sumSubtractMultiplyDivideInt {
    public static void main(String[] args){
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = input.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int divideResult = firstNumber / secondNumber;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Multiply Result: " + multiplyResult);
        System.out.println("Divide Result: " + divideResult);

    }
}
