package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3;

public interface ProductDatabasee {

    void save(Product product);

    Product findByTitle(String productTitle);

}
