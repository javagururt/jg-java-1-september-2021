package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {
    @Test
    public void isFraudTest() {
        FraudRule2 fraudRule1 = new FraudRule2("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(1000001);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFalse() {
        FraudRule2 fraudRule1 = new FraudRule2("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon1");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult, result);
    }

}