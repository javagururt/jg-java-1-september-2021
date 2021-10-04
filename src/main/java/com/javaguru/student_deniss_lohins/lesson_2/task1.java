package com.javaguru.student_deniss_lohins.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Необходимо исправить package на 'com.javaguru.student_Deniss_Lohins.lesson_2'." +
        "Нет необходимости сокращать название secNumber - можно написать secondNumber.")
public class task1 {
    public static void main(String[] args) {
        System.out.print("Hello! Enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.print("Please enter second number: ");
        int secNumber = input.nextInt();
        System.out.println("Summ result = " + (firstNumber + secNumber));
        System.out.println("Substract result = " + (firstNumber - secNumber));
        System.out.println("Divide result = " + (firstNumber / secNumber));
        System.out.println("Multriply result = " + (firstNumber * secNumber));
    }
}
