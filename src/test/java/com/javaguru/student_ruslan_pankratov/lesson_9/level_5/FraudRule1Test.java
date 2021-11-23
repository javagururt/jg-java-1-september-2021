package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {
    @Test
    public void isFraudTest() {
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);
    }
    @Test
   public void isFraudTestFalse() {
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon1");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult,result);
    }

}