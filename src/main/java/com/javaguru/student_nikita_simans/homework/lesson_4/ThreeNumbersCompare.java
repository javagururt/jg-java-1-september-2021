package com.javaguru.student_nikita_simans.homework.lesson_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class ThreeNumbersCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();



        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All number are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }
}
