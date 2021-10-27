package com.javaguru.student_ruslan_pankratov.lesson_3.level_7;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

//Task_26
@CodeReview(approved = true)
class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice(){
        double priceDiscount = regularPrice / 100 * discount;
        double result  = regularPrice - priceDiscount;
        return result;
    }

    void printInformation(){
        System.out.println("Имя продукта = " + name + ", ценя без скидки = "
                + regularPrice + ", скидка " + discount +"%, цена со скидкой = " + actualPrice());
    }
}
