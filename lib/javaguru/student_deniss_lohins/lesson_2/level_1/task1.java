package com.javaguru.student_deniss_lohins.lesson_2.level_1;


import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
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
