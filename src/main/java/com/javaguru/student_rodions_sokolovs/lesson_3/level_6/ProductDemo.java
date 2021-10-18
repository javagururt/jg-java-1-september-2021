package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Kiwi");
        product.regularPrice = 1000;
        product.discount = 18;
        product.productinf();
    }
}
