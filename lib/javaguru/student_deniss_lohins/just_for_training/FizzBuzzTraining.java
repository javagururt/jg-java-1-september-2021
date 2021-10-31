package com.javaguru.student_deniss_lohins.just_for_training;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTraining {

    public static void main(String[] args) {
        int number = 11;
        String expectedResult = "" + number;
        String answer = "" + number;
        boolean equals = expectedResult.equals(answer);
        System.out.println(answer);
        System.out.println(equals);

    }
}
