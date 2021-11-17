package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

import com.javaguru.student_dmitrii_faierberg.lesson_7.level_6.CreditCard;
import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class  CreditCardTest {
    CreditCard victim = new CreditCard(2456, "3214536422214398");

    @Test
    public void testDepositDebtZero(){
        victim.deposit(2456, 100);
        assertEquals(100, victim.getBalance(), 0.000001);
        assertEquals(0, victim.getCreditDebt(), 0.000001);
    }

    @Test
    public void testWithdrawDebtZero(){
        victim.deposit(2456,100);
        double real = victim.withdraw(2456, 50);
        double expected = 50;
        assertEquals(expected, real, 0.1);

    }

    @Test
    public void testWithdrawDebtNonZero(){
        victim.setCreditLimit(1000);
        victim.deposit(2456,100);
        double real = victim.withdraw(2456, 200);
        double expected = 200;
        assertEquals(expected, real, 0.1);

        real = victim.getCreditDebt();
        expected = 100;
        assertEquals(expected, real, 0.1);

    }

    @Test
    public void testDepositDebtNonZero(){
        victim.setCreditLimit(1000);
        double takenSum = victim.withdraw(2456, 50);
        victim.deposit(2456, 100);
        assertEquals(50, victim.getBalance(), 0.000001);
        assertEquals(0, victim.getCreditDebt(), 0.000001);
    }

}