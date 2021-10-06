package com.javaguru.student_ruslan_pankratov.lesson_2.level_7;

import com.javaguru.teacher.review.CodeReview;

//Task_31
@CodeReview(approved = true)
public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        double result = regularPrice - ((regularPrice / 100) * discount);
        return result;
    }

    void printInformation() {
        System.out.println("Цена продукта без скидки: " + regularPrice + " EUR");
        System.out.println("Сегодня скидка: " + discount + "%");
        System.out.println("Цена со скидкой: " + actualPrice() + " EUR");
    }
}


