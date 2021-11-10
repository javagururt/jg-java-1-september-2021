package com.javaguru.student_ruslan_pankratov.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CreditCardTest {
    @Test
    public void depositTest() {
        CreditCard creditCard = new CreditCard(7854342, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777, 4000);

        int result = creditCard.getBalance();
        int expectedResult = 4000;
        assertEquals(result,expectedResult);
    }

    @Test
    public void depositRepaymentOfADebtTest() {
        CreditCard creditCard = new CreditCard(7854342, 7777);
        creditCard.setCreditLimit(200);
        creditCard.withdraw(7777, 200);
        creditCard.deposit(7777, 4000);

        int result = creditCard.getBalance();
        int expectedResult = 3800;
        int resultTwo = creditCard.getLoanDebt();
        int expectedResultTwo = 0;
        assertEquals(result,expectedResult);
        assertEquals(resultTwo,expectedResultTwo);
    }

    @Test
    public void withdrawTest() {
        CreditCard creditCard = new CreditCard(78543452, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777, 4000);
        creditCard.withdraw(7777, 3000);
        int result = creditCard.getBalance();
        int expectedResult = 1000;
        assertEquals(result,expectedResult);

    }

    @Test
    public void withdrawWeBorrowTest() {
        CreditCard creditCard = new CreditCard(78543452, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777, 4000);
        creditCard.withdraw(7777, 4157);
        int result = creditCard.getLoanDebt();
        int expectedResult = 157;
        assertEquals(result,expectedResult);

    }

    @Test
    public void withdrawNotEnoughMoneyTest() {
        CreditCard creditCard = new CreditCard(78543452, 7777);
        creditCard.setCreditLimit(200);
        creditCard.deposit(7777, 4000);
        creditCard.withdraw(7777, 4600);
        int result = creditCard.getBalance();
        int expectedResult = 4000;
        assertEquals(result,expectedResult);

    }

}