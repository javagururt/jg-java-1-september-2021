package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.text.DecimalFormat;
@CodeReview(approved = true)
class Product {

    private String productName;
    private double regularPrice;
    private double discount;
    private double actualPriceFull;
    private double actualPrice;

    public Product(String productName){
        this.productName = productName;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void calculateActualPrice(){
        actualPrice = ((100 - discount) * regularPrice) / 100;

    }

    void printInformation(){
        calculateActualPrice();
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Product name is " + productName);
        System.out.println("Product regular price is " + regularPrice + " € per unit");
        System.out.println("Product discount is " + discount + " %");
        System.out.println("Product price with discount is " + df.format(actualPrice) + " € per unit");
    }
}
