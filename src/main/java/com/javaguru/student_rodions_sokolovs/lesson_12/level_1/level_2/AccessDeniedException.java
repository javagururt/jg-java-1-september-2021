package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AccessDeniedException extends Exception{
    public AccessDeniedException(String message) {
        super(message);
    }
}
