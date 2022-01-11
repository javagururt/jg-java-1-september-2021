package com.javaguru.teacher.lesson_15.lessoncode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductRepositoryHashMapImpl implements ProductRepository {

    private Map<Long, Product> database = new HashMap<>();

    @Override
    public Product save(Product product) {
        long id = SequenceIdGenerator.generateId();
        Product newProduct = new Product(id, product.getName(), product.getPrice());
        database.put(id, newProduct);
        return newProduct;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(database.get(id));
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

    @Override
    public void update(Product product) {
        throw new UnsupportedOperationException();
    }
}
