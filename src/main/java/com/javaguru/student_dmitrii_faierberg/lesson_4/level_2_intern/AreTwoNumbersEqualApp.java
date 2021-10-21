package com.javaguru.student_dmitrii_faierberg.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class AreTwoNumbersEqualApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) System.out.println("Numbers are equal");
        else System.out.println("Numbers are different");
    }
}
