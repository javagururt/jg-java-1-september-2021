package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
