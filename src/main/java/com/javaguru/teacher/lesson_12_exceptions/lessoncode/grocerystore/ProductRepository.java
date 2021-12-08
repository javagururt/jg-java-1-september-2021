package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

import java.util.ArrayList;
import java.util.List;

class ProductRepository {

    private static long sequenceId = 0;

    private List<Product> database = new ArrayList<>();

    Product save(Product product) {
        product.setId(sequenceId);
        sequenceId++;
        database.add(product);
        return product;
    }

    Product findById(Long id) {
        for (int i = 0; i < database.size(); i++) {
            Product product = database.get(i);
            Long productId = product.getId();

            if (productId.equals(id)) {
                return database.get(i);
            }
        }
        return null;
    }
}
