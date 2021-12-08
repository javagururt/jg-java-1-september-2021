package com.javaguru.student_deniss_lohins.lesson_10.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);
}
