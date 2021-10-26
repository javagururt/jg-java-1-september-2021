package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.shouldSetPriceOnCreate();
        testRunner.shouldUpdateMaxPrice();
        testRunner.shouldUpdateMinPrice();
        testRunner.shouldUpdateCurrentPrice();
    }

    public void shouldSetPriceOnCreate(){
        Stock stock = new Stock("GOOG", 500);
        int expected = 500;
        int actualCurrentPrice = stock.getCurrentPrice();
        int actualMinPrice = stock.getMinPrice();
        int actualMaxPrice = stock.getMaxPrice();

        if (expected != actualCurrentPrice){
            System.err.println("shouldSetPriceOnCreate failed, expected current price: " +expected+ " actual current price: " +actualCurrentPrice);
        } else if (expected != actualMinPrice){
            System.err.println("shouldSetPriceOnCreate failed, expected current price: " +expected+ " actual current price: " +actualMinPrice);
        }else if (expected != actualMaxPrice){
            System.err.println("shouldSetPriceOnCreate failed, expected current price: " +expected+ " actual current price: " +actualMaxPrice);
        } else {
            System.out.println("shouldSetPriceOnCreate: SUCCESS");
        }
    }
    public void shouldUpdateMaxPrice(){
        Stock stock = new Stock("GOOG", 500);
        stock.updatePrice("GOOG", 600);
        int expected = 600;
        int actual = stock.getMaxPrice();

        if (expected == actual){
            System.out.println("shouldUpdateMaxPrice: PASSED ");
        }else {
            System.err.println("shouldUpdateMaxPrice: FAILED, expected:" +expected+ " actual: " +actual);
        }
    }
    public void shouldUpdateMinPrice(){
        Stock stock = new Stock("GOOG", 500);
        stock.updatePrice("GOOG", 400);
        int expected = 400;
        int actual = stock.getMinPrice();

        if (expected == actual){
            System.out.println("shouldUpdateMinPrice: PASSED ");
        }else {
            System.err.println("shouldUpdateMinPrice: FAILED, expected:" +expected+ " actual: " +actual);
        }
    }
    public void shouldUpdateCurrentPrice(){
        Stock stock = new Stock("GOOG", 500);
        stock.updatePrice("GOOG", 100);
        int expected = 100;
        int actual = stock.getCurrentPrice();

        if (expected == actual){
            System.out.println("shouldUpdateCurrentPrice: PASSED ");
        }else {
            System.err.println("shouldUpdateCurrentPrice: FAILED, expected:" +expected+ " actual: " +actual);
        }
    }
}
