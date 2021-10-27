package com.javaguru.student_vadims_ilatovskis.lesson_4.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
//task_4
@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно было использовать просто 'else'.")
class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Hello, please enter integer number and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){System.out.println("Your number is even number");}
        else if (number % 2 != 0){System.out.println("Your number is odd number");}

    }
}
