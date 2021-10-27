package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_1_intern;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "нечетные - odd")
class EvenUneven {
    public static void main(String[] args) {
        System.out.println("Hi! Please enter int number.");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        if(inputNumber % 2 == 0) {
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is uneven.");
        }
    }
}
