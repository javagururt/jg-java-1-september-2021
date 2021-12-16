package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.rules;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;

public interface ValidationRule {

    void validate(Product product);

    default void checkNotNull(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product must not be null");
        }
    }
}
