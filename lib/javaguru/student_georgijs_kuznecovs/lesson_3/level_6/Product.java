package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;

    Product (String name){
        this.name = name;
    }

    double actualPrice(){
        double result = regularPrice - regularPrice / 100 * discount;
        return result;
    }

    void printInformation(){
        System.out.println(name + " price was " + regularPrice + " eur/kg");
        System.out.println("But only today you can have it with a discount of " + discount + "%");
        System.out.println(name + " actual price: " + actualPrice() + " eur/kg");
    }
}
