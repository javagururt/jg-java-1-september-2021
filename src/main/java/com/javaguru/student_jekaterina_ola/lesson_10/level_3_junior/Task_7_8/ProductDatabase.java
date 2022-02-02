package com.javaguru.student_jekaterina_ola.lesson_10.level_3_junior.Task_7_8;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
