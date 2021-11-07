package com.javaguru.student_deniss_lohins.lesson_7.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void deposit() {
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.deposit(100.00, "0000");
        double expectedResult = 100.00;
        double obtainedResult = victim.getBalance();
        assertEquals(expectedResult, obtainedResult, 0.000);
    }

    @Test
    public void depositWithWrongPinCode(){
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.deposit(100.00, "0100");
        double expectedResult = 0;
        double obtainedResult = victim.getBalance();
        assertEquals(expectedResult, obtainedResult, 0.000);
    }

    @Test
    public void depositWithCreditDebt(){
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setCreditDebt(-10);
        victim.deposit(100.00, "0000");
        assertEquals(90.0, victim.getBalance(), 0.000);
        assertEquals(0, victim.getCreditDebt(), 0.000);
    }

    @Test
    public void depositWithBigCreditDebt(){
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setCreditDebt(-100);
        victim.deposit(90.00, "0000");
        assertEquals(0, victim.getBalance(), 0.000);
        assertEquals(-10, victim.getCreditDebt(), 0.000);
    }

    @Test
    public void withdrawWithRightPin() {
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setBalance(100);
        victim.withdraw(20, "0000");
        assertEquals(80, victim.getBalance(), 0.000);
        assertEquals(0, victim.getCreditDebt(), 0.000);
    }
    @Test
    public void withdrawWithWrongPin() {
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setBalance(100);
        victim.withdraw(20, " 000");
        assertEquals(100, victim.getBalance(), 0.000);
        assertEquals(0, victim.getCreditDebt(), 0.000);
    }

    @Test
    public void withdrawWithInsufficientBalance() {
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setBalance(10);
        victim.setCreditLimit(100);
        victim.withdraw(20, "0000");
        assertEquals(0, victim.getBalance(), 0.000);
        assertEquals(-10, victim.getCreditDebt(), 0.000);
    }
    @Test
    public void withdrawWithInsuffisientBalanceAndCreditLimit(){
        CreditCard victim = new CreditCard("1234123412341234", "0000");
        victim.setBalance(10);
        victim.setCreditDebt(-95);
        victim.setCreditLimit(100);
        victim.withdraw(20, "0000");
        assertEquals(10, victim.getBalance(), 0.000);
        assertEquals(-95, victim.getCreditDebt(), 0.000);
    }
}