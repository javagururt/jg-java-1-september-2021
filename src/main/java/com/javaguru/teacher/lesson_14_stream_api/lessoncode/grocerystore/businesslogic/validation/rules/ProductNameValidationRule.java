package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation.rules;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

public class ProductNameValidationRule implements ValidationRule {

    public static final int MAX_LENGTH = 10;
    public static final int MIN_LENGTH = 3;

    @Override
    public void validate(Product product) {
        checkNotNull(product);
        checkNameNotNull(product);
        checkMaxLength(product);
        checkMinLength(product);
    }

    private void checkMinLength(Product product) {
        if (product.getName().length() < MIN_LENGTH) {
            throw new IllegalArgumentException(String.format("Product name length must be greater than %s", MIN_LENGTH));
        }
    }

    private void checkNameNotNull(Product product) {
        if (product.getName() == null) {
            throw new IllegalArgumentException("Product name must not be null");
        }
    }

    private void checkMaxLength(Product product) {
        if (product.getName().length() > MAX_LENGTH) {
            throw new IllegalArgumentException(String.format("Product name length must be less than %s", MAX_LENGTH));
        }
    }
}
