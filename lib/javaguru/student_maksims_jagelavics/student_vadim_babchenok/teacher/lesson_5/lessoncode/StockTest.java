package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_5.lessoncode;

class StockTest {

    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.shouldSetCurrentPriceOnCreate();
        testRunner.shouldSetMaxPriceSameAsCurrentOnCreate();
        testRunner.shouldSetMinPriceSameAsCurrentOnCreate();

        testRunner.shouldUpdateCurrentPrice();
        testRunner.shouldUpdateMinPrice();
        testRunner.shouldUpdateMaxPrice();
    }


    public void shouldSetMinPriceSameAsCurrentOnCreate() {
        Stock stock = new Stock(100.00);

        double expected = 100;

        double actual = stock.getMinPrice();

        if (expected == actual) {
            System.out.println("shouldSetMinPriceSameAsCurrentOnCreate: SUCCESS");
        } else {
            System.err.println("shouldSetMinPriceSameAsCurrentOnCreate: FAILED, expected: " + expected +
                    " , actual: " + actual);
        }
    }

    public void shouldSetMaxPriceSameAsCurrentOnCreate() {
        Stock stock = new Stock(100.00);

        double expected = 100;

        double actual = stock.getMaxPrice();

        if (expected == actual) {
            System.out.println("shouldSetMaxPriceSameAsCurrentOnCreate: SUCCESS");
        } else {
            System.err.println("shouldSetMaxPriceSameAsCurrentOnCreate: FAILED, expected: " + expected +
                    " , actual: " + actual);
        }
    }

    public void shouldSetCurrentPriceOnCreate() {
        Stock stock = new Stock(100.00);

        double expected = 100;

        double actual = stock.getCurrentPrice();

        if (expected == actual) {
            System.out.println("shouldSetCurrentPriceOnCreate: SUCCESS");
        } else {
            System.err.println("shouldSetCurrentPriceOnCreate: FAILED, expected: " + expected +
                    " , actual: " + actual);
        }
    }

    public void shouldUpdateMaxPrice() {
        Stock stock = new Stock(100.00);

        stock.update(200);

        double expected = 200;
        double actual = stock.getMaxPrice();

        if (expected == actual) {
            System.out.println("shouldUpdateMaxPrice: SUCCESS");
        } else {
            System.err.println("shouldUpdateMaxPrice: FAILED, expected: " + expected + " , actual: " + actual);
        }
    }

    public void shouldUpdateMinPrice() {
        Stock stock = new Stock(100.00);

        stock.update(50);

        double expected = 50;

        double actual = stock.getMinPrice();

        if (expected == actual) {
            System.out.println("shouldUpdateMinPrice: SUCCESS");
        } else {
            System.err.println("shouldUpdateMinPrice: FAILED, expected: " + expected + " , actual: " + actual);
        }
    }

    public void shouldUpdateCurrentPrice() {
        Stock stock = new Stock(100.00);

        stock.update(500);

        double expected = 500;

        double actual = stock.getCurrentPrice();

        if (expected == actual) {
            System.out.println("shouldUpdateCurrentPrice: SUCCESS");
        } else {
            System.err.println("shouldUpdateCurrentPrice: FAILED, expected: " + expected + " , actual: " + actual);
        }
    }
}
