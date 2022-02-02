package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;

///task7//task10
@CodeReview(approved = true)
public interface ProductDatabase {

        void save(Product product);

        Optional<Product> findByTitle(String productTitle);

    }

//НЕТ
