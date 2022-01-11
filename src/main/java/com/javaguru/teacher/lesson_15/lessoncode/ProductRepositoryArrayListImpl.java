package com.javaguru.teacher.lesson_15.lessoncode;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryArrayListImpl implements ProductRepository {

    private List<Product> database;

    public ProductRepositoryArrayListImpl(List<Product> database) {
        this.database = database;
    }

    @Override
    public Product save(Product product) {
        long id = SequenceIdGenerator.generateId();
        Product newProduct = new Product(id, product.getName(), product.getPrice());
        database.add(newProduct);
        return newProduct;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return database.stream()
                .filter(product -> product.getId().equals(id))
                .map(Product::new)
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {
        database.removeIf(product -> id.equals(product.getId()));
    }

    @Override
    public boolean existsByName(String name) {
        return database.stream()
                .anyMatch(product -> product.getName().equals(name));
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < database.size(); i++) {
            Long foundProductId = database.get(i).getId();
            if (foundProductId.equals(product.getId())) {
                Product copy = new Product(product);
                database.set(i, copy);
            }
        }
    }
}
