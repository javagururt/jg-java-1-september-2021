package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

import java.util.Scanner;

class ProductDemo {

    public static void main(String[] args) {
        System.out.println("Enter regular price: ");
        Scanner input = new Scanner(System.in);
        double regularPrice = input.nextDouble();
        System.out.println("Enter discount: ");
        double discount = input.nextDouble();

    Product object1 = new Product("table");
String name = object1.getName();
        System.out.println("Actual price product " +  name + ": " + (regularPrice/(discount/100+1)));
    }
}