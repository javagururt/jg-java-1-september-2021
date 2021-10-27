package com.javaguru.student_nikita_simans.homework.lesson_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_11 {

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        double thirdNumberDouble = thirdNumber;
        double arithmeticMean = (firstNumber + secondNumber + thirdNumberDouble) / 3;

        System.out.println("Arithmetic mean = " + arithmeticMean);



    }
}