package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    private String name;
    private double regularPrice;
    private double discount;

    Product(String productName, double productRegularPrice, double productDiscount) {
        this.name = productName;
        this.regularPrice = productRegularPrice;
        this.discount = productDiscount;
    }

    void printInformation() {
        System.out.println("Product name: " + name);
        regularPrice = regularPrice - discount;
        System.out.println("Product actual price: " + regularPrice);
    }
}
