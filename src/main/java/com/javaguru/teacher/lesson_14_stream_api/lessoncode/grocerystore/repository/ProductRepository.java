package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);

    Optional<Product> findById(Long id);

    void deleteById(Long id);

    boolean existsByName(String name);

    void update(Product product);
}
