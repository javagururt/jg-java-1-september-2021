package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Tomato");
        product.regularPrice = 2.40;
        product.discount = 20;
        product.printInformation();
    }
}
