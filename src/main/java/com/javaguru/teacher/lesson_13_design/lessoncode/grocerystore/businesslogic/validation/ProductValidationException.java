package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation;

public class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
