package com.javaguru.student_deniss_lohins.lesson_12.level_5.validation;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ValidationException extends Exception{

    public ValidationException(String test) {
        super(test);
    }
}
