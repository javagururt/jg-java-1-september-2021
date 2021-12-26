package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product not found with id = " + id);
    }
}
