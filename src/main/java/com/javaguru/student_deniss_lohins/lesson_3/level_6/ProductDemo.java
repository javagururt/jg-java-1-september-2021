package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Banana");
        product1.setRegularPrice(1.29);
        product1.setDiscount(25.908657);
        product1.printInformation();
    }
}
