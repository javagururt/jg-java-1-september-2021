package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product not found with id = " + id);
    }
}
