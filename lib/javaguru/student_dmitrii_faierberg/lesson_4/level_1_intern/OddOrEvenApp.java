package com.javaguru.student_dmitrii_faierberg.lesson_4.level_1_intern;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class OddOrEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(number + " is " + result);

    }
}
