package com.javaguru.student_dmitrii_faierberg.lesson_2.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        System.out.println("Average of your numbers is: " + average);
    }
}
