package com.javaguru.student_dmitrii_faierberg.lesson_4.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class OrderOfThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) System.out.println("increasing");
        else if (firstNumber > secondNumber && secondNumber > thirdNumber) System.out.println("decreasing");
        else System.out.println("Neither increasing or decreasing order");
    }

}
