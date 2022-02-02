package com.javaguru.student_nikita_simans.homework.lesson_12.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AccessDeniedException extends Exception{
    public AccessDeniedException(String message) {
        super(message);
    }
}
