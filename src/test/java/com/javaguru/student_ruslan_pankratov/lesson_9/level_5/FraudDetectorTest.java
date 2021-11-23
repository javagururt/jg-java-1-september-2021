package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void isFraudTest() {
        List<FraudRule> fraudRule = fraudRuleList();
        Trader trader = new Trader();
        trader.setFullName("Pokemon");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRule);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "One");


        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFalse() {
        List<FraudRule> fraudRule = fraudRuleList();

        Trader trader = new Trader();
        trader.setFullName("Pokemon123");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);


        FraudDetectionResult result = fraudDetector.isFraud(fraudRule);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Не одно из правил не сработало");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestTwo() {
        List<FraudRule> fraudRules = fraudRuleList();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(1000001);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Two");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestTwoFalse() {
        List<FraudRule> fraudRule = fraudRuleList();

        Trader trader = new Trader();
        trader.setFullName("Poke");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(999999);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRule);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Не одно из правил не сработало");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestThree() {
        List<FraudRule> fraudRules = fraudRuleList();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCity("Сидней");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Four");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestThreeFalse() {
        List<FraudRule> fraudRules = fraudRuleList();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCity("Сидн");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Не одно из правил не сработало");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFour() {
        List<FraudRule> fraudRules = fraudRuleList();

        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Ямайка");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Fife");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFourFalse() {
        List<FraudRule> fraudRules = fraudRuleList();

        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Сидн3");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Не одно из правил не сработало");

        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFife() {
        List<FraudRule> fraudRules = fraudRuleList();

        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Германия");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(1001);
        FraudDetector fraudDetector = new FraudDetector(transaction);


        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "Three");
        assertEquals(expectedResult, result);
    }

    @Test
    public void isFraudTestFifeFalse() {
        List<FraudRule> fraudRules = fraudRuleList();
        Trader trader = new Trader();
        trader.setFullName("Poke");
        trader.setCountry("Германия");
        Transaction transaction = new Transaction();
        transaction.setTrader(trader);
        transaction.setAmount(999);
        FraudDetector fraudDetector = new FraudDetector(transaction);

        FraudDetectionResult result = fraudDetector.isFraud(fraudRules);
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, "Не одно из правил не сработало");

        assertEquals(expectedResult, result);
    }

    List<FraudRule> fraudRuleList() {
        List<FraudRule> fraudRule = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("One");
        FraudRule2 fraudRule2 = new FraudRule2("Two");
        FraudRule3 fraudRule3 = new FraudRule3("Three");
        FraudRule4 fraudRule4 = new FraudRule4("Four");
        FraudRule5 fraudRule5 = new FraudRule5("Fife");
        fraudRule.add(fraudRule1);
        fraudRule.add(fraudRule2);
        fraudRule.add(fraudRule3);
        fraudRule.add(fraudRule4);
        fraudRule.add(fraudRule5);

        return fraudRule;
    }
}