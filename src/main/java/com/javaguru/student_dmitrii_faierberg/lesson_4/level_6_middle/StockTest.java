package com.javaguru.student_dmitrii_faierberg.lesson_4.level_6_middle;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.maxCaseTest();
        test.minCaseTest();
        test.currentPriceCaseTest();
    }

    public void maxCaseTest(){
        //10 -> 12 -> 5 -> 7 -> 99 -> 77
        Stock victim = new Stock("Apple", 14);
        victim.updatePrice(10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        victim.updatePrice(77);
        int result = victim.getMaxPrice();
        if (result == 99) System.out.println("maxCaseTest = OK" );
        else System.err.println("maxCaseTest = FAIL");
    }

    public void minCaseTest(){
        //10 -> 12 -> 5 -> 7 -> 99 -> 77
        Stock victim = new Stock("Apple", 14);
        victim.updatePrice(10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        victim.updatePrice(77);
        int result = victim.getMinPrice();
        if (result == 5) System.out.println("minCaseTest = OK" );
        else System.err.println("minCaseTest = FAIL");
    }

    public void currentPriceCaseTest(){
        //10 -> 12 -> 5 -> 7 -> 99 -> 77
        Stock victim = new Stock("Apple", 14);
        victim.updatePrice(10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        victim.updatePrice(77);
        int result = victim.getCurrentPrice();
        if (result == 77) System.out.println("currentPriceCaseTest = OK" );
        else System.err.println("currentPriceCaseTest = FAIL");
    }



}
