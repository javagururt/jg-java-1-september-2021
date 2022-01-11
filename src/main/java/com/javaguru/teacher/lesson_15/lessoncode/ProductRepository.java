package com.javaguru.teacher.lesson_15.lessoncode;

import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);

    Optional<Product> findById(Long id);

    void deleteById(Long id);

    boolean existsByName(String name);

    void update(Product product);
}
