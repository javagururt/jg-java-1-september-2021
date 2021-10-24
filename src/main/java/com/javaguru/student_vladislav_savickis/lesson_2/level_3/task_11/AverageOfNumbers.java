package com.javaguru.student_vladislav_savickis.lesson_2.level_3.task_11;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class AverageOfNumbers {
    public static void main(String[] args) {
        System.out.println("Bonjour! Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = input.nextInt();
        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average of " + firstNumber + " " + secondNumber + " " + thirdNumber + " = " + average);
    }
}
