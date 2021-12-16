package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryHashMapImpl implements ProductRepository {

    private Map<Long, Product> database = new HashMap<>();

    @Override
    public Product save(Product product) {
        long id = SequenceIdGenerator.generateId();
        product.setId(id);
        database.put(id, product);
        return product;
    }

    @Override
    public Product findById(Long id) {
        return database.get(id);
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }

    @Override
    public boolean existsByName(String name) {
        for (Map.Entry<Long, Product> entry : database.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
