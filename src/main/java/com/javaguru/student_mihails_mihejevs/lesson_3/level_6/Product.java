package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {

    private String name;
    double actualPrice;

    public Product(String productName){
        this.name = productName;
    }
    public String getName(){
        return this.name;
    }
}
