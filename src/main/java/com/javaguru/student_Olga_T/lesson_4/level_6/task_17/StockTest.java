package com.javaguru.student_Olga_T.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);


        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);


        StockTest stockTest = new StockTest();
        stockTest.test1();
        stockTest.test2();
        stockTest.test3();
        stockTest.test4();
        stockTest.test5();

    }


    public void test1() {
        Stock stock = new Stock("AAA", 999);

        if (stock.getStockMaxPrice() == 999) {
            System.out.println("test1 OK");
        } else {
            System.out.println("test1 FAIL");

        }
        System.out.println(stock.getPriceInformation());
    }

    public void test2() {
        Stock stock = new Stock("AAA", 999);
        stock.updatePrice(1);
        if (stock.getStockMaxPrice() == 999) {
            System.out.println("test2 OK");
        } else {
            System.out.println("test2 FAIL");
        }
        System.out.println(stock.getPriceInformation());
    }

    public void test3() {
        Stock stock = new Stock("AAA", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        if (stock.getStockMaxPrice() == 1000) {
            System.out.println("test3 OK");
        } else {
            System.out.println("test3 FAIL");
        }
        System.out.println(stock.getPriceInformation());
    }

    public void test4() {
        Stock stock = new Stock("AAA", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        if (stock.getStockMaxPrice() == 1000) {
            System.out.println("test4 OK");
        } else {
            System.out.println("test4 FAIL");
        }
        System.out.println(stock.getPriceInformation());
    }

    public void test5() {
        Stock stock = new Stock("AAA", 9);
        stock.updatePrice(27);
        if (stock.getStockMaxPrice() == 27) {
            System.out.println("test5 OK");
        } else {
            System.out.println("test5 FAIL");
        }
        System.out.println(stock.getPriceInformation());
    }


}

