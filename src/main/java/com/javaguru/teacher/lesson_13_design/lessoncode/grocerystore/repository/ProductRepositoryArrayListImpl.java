package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryArrayListImpl implements ProductRepository {

    private List<Product> database = new ArrayList<>();

    @Override
    public Product save(Product product) {
        long id = SequenceIdGenerator.generateId();
        product.setId(id);
        database.add(product);
        return product;
    }

    @Override
    public Product findById(Long id) {
        for (Product product : database) {
            Long productId = product.getId();

            if (productId.equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        database.removeIf(product -> id.equals(product.getId()));
    }

    @Override
    public boolean existsByName(String name) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
