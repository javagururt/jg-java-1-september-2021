package com.javaguru.student_deniss_lohins.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Необходимо исправить package на 'com.javaguru.student_Deniss_Lohins.lesson_2'.")
public class task2 {
    public static void main(String[] args) {
        System.out.print("Hello! Enter first number: ");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        System.out.print("Please enter second number: ");
        double secNumber = input.nextDouble();
        System.out.println("Summ result = " + (firstNumber + secNumber));
        System.out.println("Substract result = " + (firstNumber - secNumber));
        System.out.println("Divide result = " + (firstNumber / secNumber));
        System.out.println("Multriply result = " + (firstNumber * secNumber));
    }
}
