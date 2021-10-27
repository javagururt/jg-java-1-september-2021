package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    private String name;
    double regularPrice;
    double discount;

    Product(String name) { this.name = name; }

    double actualPrice(){
        return regularPrice * (1 - discount*0.01);
    }

    void printInformation(){
        System.out.println("Product: " + name);
        System.out.println("Old price: " + regularPrice);
        System.out.println("New price: " + this.actualPrice());
    }
}
