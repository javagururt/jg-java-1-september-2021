package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface ProductValidator {
    List<ValidationException> validate(Product product);
}
