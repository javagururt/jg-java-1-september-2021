package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_6.task_26;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Apple", 0.50, 5);
        System.out.println("Product name: " +product.getName());
        System.out.println(product.getName()+ " price is " +product.getRegularPrice()+ " EUR.");
        System.out.println("Discount is " +product.getDiscount()+ "%");
        product.actualPrice();
        product.printInformation();
    }
}
