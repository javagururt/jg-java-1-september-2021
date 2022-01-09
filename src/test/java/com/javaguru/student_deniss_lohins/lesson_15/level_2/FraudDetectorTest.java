package com.javaguru.student_deniss_lohins.lesson_15.level_2;

import com.javaguru.student_deniss_lohins.lesson_14.level_3_4_5_6.Trader;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {
    @Test
    public void isFraudBothOptions(){
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Sidney");
        assertTrue(victim.isFraud(trader));
    }

    @Test
    public void isFraudNameOptions(){
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga");
        assertTrue(victim.isFraud(trader));
    }

    @Test
    public void isFraudCityOptions(){
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Antonio", "Sidney");
        assertTrue(victim.isFraud(trader));
    }

    @Test
    public void isNotFraudBothOptions(){
        FraudDetector victim = new FraudDetector();
        Trader trader = new Trader("Antonio", "Madrid");
        assertFalse(victim.isFraud(trader));
    }
}