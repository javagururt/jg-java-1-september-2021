package com.javaguru.student_dmitrii_faierberg.lesson_2.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Please, enter two real numbers:");
        Scanner input = new Scanner(System.in);

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + " + " + secondNumber + " = " +
                (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " +
                (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " +
                (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " +
                (firstNumber / secondNumber));
    }
}
