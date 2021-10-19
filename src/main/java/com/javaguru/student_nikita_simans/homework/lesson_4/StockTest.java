package com.javaguru.student_nikita_simans.homework.lesson_4;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("Red Hat", 10);
        String priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
    }
}
