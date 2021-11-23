package com.javaguru.student_ruslan_pankratov.lesson_9.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraudTest() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Pokemon123");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestTwo() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(1000001);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestTwoFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(999999);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestThree() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCity("Сидней");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);


        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestThreeFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCity("Сидн");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);


        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }


    @Test
    public void isFraudTestFour() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Ямайка");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);


        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFourFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Сидн3");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);


        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFife() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Германия");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(1001);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFifeFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Германия");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(999);

        boolean result = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }
}