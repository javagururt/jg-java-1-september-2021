package com.javaguru.student_Olga_T.lesson_3.level_6.task_26;

class Product {
    String nameOfProduct;
    double regularPrice;
    double discount;

    Product(String nameOfProduct, double regularPrice, double discount) {
        this.nameOfProduct = nameOfProduct;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice * this.discount / 100;
    }

    void printInformation() {
        String result = String.format("%.2f", this.actualPrice());
        System.out.println("The product '" + this.nameOfProduct + "' today has a discount " + this.discount + " % and it costs " + result + " EUR.");
    }
}
