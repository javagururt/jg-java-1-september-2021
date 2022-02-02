package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ProductDatabasee {

    void save(Product product);

    Product findByTitle(String productTitle);

}
