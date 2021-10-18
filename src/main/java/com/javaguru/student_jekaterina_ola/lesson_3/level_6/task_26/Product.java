package com.javaguru.student_jekaterina_ola.lesson_3.level_6.task_26;

// Наименование (String name)
// Стандартная цена (double regularPrice)
// Скидка в процентах (double discount)

public class Product {
    private String productName;
    double regularPrice;
    double discount;

    public Product(String productName, double regularPrice, double discount){
        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double setPrice(){return this.regularPrice - regularPrice * this.discount / 100;}

    void printInformation(){
        System.out.println("Product name: " + productName);
        System.out.println("Product price is: " + regularPrice);
        System.out.println("Product price with the discount is: " + this.setPrice());
    }
    }

