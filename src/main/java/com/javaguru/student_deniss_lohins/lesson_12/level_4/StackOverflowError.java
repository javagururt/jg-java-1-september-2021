package com.javaguru.student_deniss_lohins.lesson_12.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StackOverflowError {

    String[] args;
    public static void main(String[] args) {
        StackOverflowError victim = new StackOverflowError();
        victim.main(args);
    }
}
