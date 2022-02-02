package com.javaguru.student_deniss_lohins.lesson_12.level_5.validation.validation_rules;

import com.javaguru.student_deniss_lohins.lesson_12.level_5.Product;
import com.javaguru.student_deniss_lohins.lesson_12.level_5.validation.ValidationException;
import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ValidationForProduct{
    boolean isValid (Product product) throws ValidationException;
}
