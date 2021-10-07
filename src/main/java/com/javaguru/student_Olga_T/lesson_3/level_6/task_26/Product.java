package com.javaguru.student_Olga_T.lesson_3.level_6.task_26;

class Product {
    String tomatoes;
    double regularPrice;
    double discount = 10;

    Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    double actualPrice() {
        this.regularPrice = regularPrice - regularPrice / 10;
        return regularPrice;
    }

    void printInformation() {
        System.out.println("The product 'tomatoes' today has a discount 10% and it costs " + actualPrice() + " EUR.");
    }
}
