package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
