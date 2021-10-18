package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_6.task_26;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    public void printInformation(){
        System.out.println("Product name: " +name);
        System.out.println(name+ " price is " +regularPrice+ " EUR.");
        System.out.println("Discount is " +discount+ "%");
    }
    public double actualPrice(){
        return this.regularPrice = this.regularPrice - (this.regularPrice/100) * this.discount;
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }
}
