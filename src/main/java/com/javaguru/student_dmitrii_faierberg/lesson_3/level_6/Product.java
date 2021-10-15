package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

class Product {
    private String name;
    double regularPrice;
    double discount;

    Product(String name) { this.name = name; }

    double actualPrice(){
        return regularPrice * (1 - discount*0.01);
    }

    void printInformation(){
        System.out.println("Product: " + name);
        System.out.println("Old price: " + regularPrice);
        System.out.println("New price: " + this.actualPrice());
    }
}
