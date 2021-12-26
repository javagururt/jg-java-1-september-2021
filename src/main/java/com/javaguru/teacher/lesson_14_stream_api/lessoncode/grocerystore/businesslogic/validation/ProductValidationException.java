package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation;

public class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
