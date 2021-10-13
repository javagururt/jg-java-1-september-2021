package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_1;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Sum = " +sum);
        System.out.println("Subtraction = " +subtraction);
        System.out.println("Multiply = " +multiply);
        System.out.println("Division = " +division);
    }

}
