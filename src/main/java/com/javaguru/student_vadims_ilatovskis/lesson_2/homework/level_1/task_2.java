package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_2 {
    public static void main(String[] args) {
        System.out.println("Please enter first comma number and press 'Enter'");
        Scanner input = new Scanner(System.in);
        double firstDoubleNumber = input.nextDouble();
        System.out.println("Please enter second comma number and press 'Enter'");
        double secondDoubleNumber = input.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtractResult = firstDoubleNumber - secondDoubleNumber;
        double multiplyResult = firstDoubleNumber * secondDoubleNumber;
        double divideResult = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum result:" + sumResult);
        System.out.println("Subtrack result:" + subtractResult);
        System.out.println("Multiply result:" + multiplyResult);
        System.out.println("Divide result:" + divideResult);

    }
}
