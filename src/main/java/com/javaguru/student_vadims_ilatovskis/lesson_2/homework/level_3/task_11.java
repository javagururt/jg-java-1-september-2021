package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_11 {
    public static void main(String[] args) {
        System.out.println("Please enter first integer number and press 'Enter'");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second integer number and press 'Enter'");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third integer number and press 'Enter'");
        int thirdNumber = input.nextInt();
        int arithmeticMean = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Arithmetic mean of three numbers = " + arithmeticMean);

    }
}
