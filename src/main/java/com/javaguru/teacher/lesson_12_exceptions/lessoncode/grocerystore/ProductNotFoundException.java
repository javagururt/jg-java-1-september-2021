package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product not found with id = " + id);
    }
}
