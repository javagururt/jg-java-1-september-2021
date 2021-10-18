package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_6_middle;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.stockTest1();

    }
    public void stockTest1() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        if (priceInformation.equals("Company = GOOG, Current Price = 10, Min Price = 10, Max Price = 10")){
            System.out.println("Stock test = OK");
        } else
            System.out.println("Stock test = FAIL");

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        if (priceInformation.equals("Company = GOOG, Current Price = 14, Min Price = 7, Max Price = 15")){
            System.out.println("Stock test = OK");
        } else
            System.out.println("Stock test = FAIL");


    }


    /*
            */


}
