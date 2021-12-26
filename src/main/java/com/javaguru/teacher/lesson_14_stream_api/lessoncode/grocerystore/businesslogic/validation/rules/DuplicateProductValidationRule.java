package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation.rules;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository.ProductRepository;

public class DuplicateProductValidationRule implements ValidationRule {
    private final ProductRepository repository;

    public DuplicateProductValidationRule(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void validate(Product product) {
        checkNotNull(product);
        String name = product.getName();
        checkDuplicateByName(name);
    }

    //change implementation on findByName and add id check.
    private void checkDuplicateByName(String name) {
        if (repository.existsByName(name)) {
            throw new IllegalArgumentException(String.format("Product name '%s' already exists.", name));
        }
    }
}
