package com.javaguru.student_nikita_simans.homework.lesson_2;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Hello! Please enter first number: ");
        Scanner input = new Scanner(System.in);
        double firstDoubleNumber = input.nextDouble();
        System.out.println("Please enter second number: ");
        double secondDoubleNumber = input.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtractResult = firstDoubleNumber - secondDoubleNumber;
        double divideResult = firstDoubleNumber / secondDoubleNumber;
        double multiplyResult = firstDoubleNumber * secondDoubleNumber;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtract result: " + subtractResult);
        System.out.println("Divide result: " + divideResult);
        System.out.println("Multiply result: " + multiplyResult);
    }
}
