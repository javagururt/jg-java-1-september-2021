package com.javaguru.student_ruslan_pankratov.lesson_3.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Task_26
@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Banana");
        product.regularPrice = 10;
        product.discount = 23;
        product.printInformation();
    }
}
