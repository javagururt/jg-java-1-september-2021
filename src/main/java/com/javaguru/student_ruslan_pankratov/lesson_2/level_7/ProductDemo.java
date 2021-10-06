package com.javaguru.student_ruslan_pankratov.lesson_2.level_7;

import com.javaguru.teacher.review.CodeReview;

//Task_31
@CodeReview(approved = true)
class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.discount = 30;
        product.regularPrice = 2;
        product.printInformation();
    }

}