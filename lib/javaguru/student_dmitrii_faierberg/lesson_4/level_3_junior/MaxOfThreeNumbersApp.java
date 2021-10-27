package com.javaguru.student_dmitrii_faierberg.lesson_4.level_3_junior;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class MaxOfThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) System.out.println(firstNumber);
            else System.out.println(thirdNumber);
        }
        else{
            if (secondNumber > thirdNumber) System.out.println(secondNumber);
            else System.out.println(thirdNumber);
        }
    }
}
