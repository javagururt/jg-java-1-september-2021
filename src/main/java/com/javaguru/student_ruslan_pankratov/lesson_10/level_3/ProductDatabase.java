package com.javaguru.student_ruslan_pankratov.lesson_10.level_3;
//Task_7

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);//No, as there are two methods

}