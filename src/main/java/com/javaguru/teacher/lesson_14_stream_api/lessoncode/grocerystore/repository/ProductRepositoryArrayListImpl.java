package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryArrayListImpl implements ProductRepository {

    private List<Product> database = new ArrayList<>();

    @Override
    public Product save(Product product) {
        long id = SequenceIdGenerator.generateId();
        Product newProduct = new Product(id, product.getName(), product.getPrice());
        database.add(newProduct);
        return newProduct;
    }

    @Override
    public Optional<Product> findById(Long id) {
        for (Product product : database) {
            Long productId = product.getId();

            if (productId.equals(id)) {
                Product copy = new Product(product);
                return Optional.of(copy);
            }
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        database.removeIf(product -> id.equals(product.getId()));
    }

    @Override
    public boolean existsByName(String name) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
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
