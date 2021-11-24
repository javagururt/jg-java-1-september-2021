package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FraudRule5Test {

    @Test
    public void isFraudTest() {
        FraudRule5 fraudRule1 = new FraudRule5("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        trader.setCountry("Ямайка");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = true;

        assertEquals(expectedResult,result);
    }

    @Test
    public void isFraudTestFalse() {
        FraudRule5 fraudRule1 = new FraudRule5("Pokemon12");
        Trader trader = new Trader();
        trader.setFullName("Pokemon1");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        boolean result = fraudRule1.isFraud(transaction);
        boolean expectedResult = false;

        assertEquals(expectedResult,result);
    }

}