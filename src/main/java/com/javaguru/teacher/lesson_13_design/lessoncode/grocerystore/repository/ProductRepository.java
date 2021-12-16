package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;

public interface ProductRepository {

    Product save(Product product);

    Product findById(Long id);

    void deleteById(Long id);

    boolean existsByName(String name);
}
