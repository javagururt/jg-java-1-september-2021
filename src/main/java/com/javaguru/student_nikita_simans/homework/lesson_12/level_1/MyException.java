package com.javaguru.student_nikita_simans.homework.lesson_12.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}