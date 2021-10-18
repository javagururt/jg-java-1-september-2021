package com.javaguru.student_jekaterina_ola.lesson_3.level_6.Task_26;

public class ProductDemo {
    public static void main(String[] args){
        Product firstProduct = new Product("Mango", 2.50, 10);
        firstProduct.printInformation();
        firstProduct.regularPrice = 2.50;
        firstProduct.discount = 10;
    }
    }
