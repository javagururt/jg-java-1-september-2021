package com.javaguru.student_jekaterina_ola.lesson_10.level_3_junior.Task_10;

import java.util.Optional;

public interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
