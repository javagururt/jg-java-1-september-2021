package com.javaguru.student_dmitrii_faierberg.lesson_4.level_2_intern;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class MinOfTwoNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) System.out.println(firstNumber);
        else System.out.println(secondNumber);
    }
}
