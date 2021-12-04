package com.javaguru.student_dmitrii_faierberg.lesson_10.level_3;

//Нет

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);
    Optional<Product> findByTitle(String productTitle);
}
