package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("cereal");
        product.regularPrice = 3.56;
        product.discount = 20;
        product.printInformation();
    }
}
