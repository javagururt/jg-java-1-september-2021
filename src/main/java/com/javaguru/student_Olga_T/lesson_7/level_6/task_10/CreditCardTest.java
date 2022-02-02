package com.javaguru.student_Olga_T.lesson_7.level_6.task_10;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.testSecurityCodeNegative();
        test.testSecurityCodePositive();
        test.testCreditLimitNegative();
        test.testCreditLimitPositive();
        test.testThenAddSumBiggerThenLoanDebt();
    }

    public void testSecurityCodeNegative() {
        CreditCard testDepositSecurityCode = new CreditCard("ERRR 3444 GHYU 4333", 3090);
        boolean result1 = testDepositSecurityCode.deposit(7113, 1000.00);
        if (!result1) {
            System.out.println("testSecurityCodeNegative TEST OK");
        } else {
            System.out.println("testSecurityCodeNegative TEST FAIL");
        }
    }

    public void testSecurityCodePositive() {
        CreditCard testDepositSecurityCode = new CreditCard("ERRR 3444 GHYU 4333", 3090);
        boolean result2 = testDepositSecurityCode.deposit(3090, 1000.00);
        if (result2) {
            System.out.println("testSecurityCodePositive TEST OK");
        } else {
            System.out.println("testSecurityCodePositive TEST FAIL");
        }
    }

    public void testCreditLimitNegative() {
        CreditCard testCreditLimit = new CreditCard("ERRR 3444 GHYU 4333", 3090);
        boolean result3 = testCreditLimit.withdraw(3090, 3000);
        if (!result3) {
            System.out.println("testCreditLimitNegative TEST OK");
        } else {
            System.out.println("testCreditLimitNegative TEST FAIL");
        }
    }

    public void testCreditLimitPositive() {
        CreditCard testCreditLimit = new CreditCard("ERRR 3444 GHYU 4333", 3090);
        boolean result4 = testCreditLimit.withdraw(3090, 1000);
        if (result4) {
            System.out.println("testCreditLimitPositive TEST OK");
        } else {
            System.out.println("testCreditLimitPositive TEST FAIL");
        }
    }

    public void testThenAddSumBiggerThenLoanDebt() {
        CreditCard testCreditLimit = new CreditCard("ERRR 3444 GHYU 4333", 3090);
        testCreditLimit.withdraw(3090, 2000);
        boolean result4 = testCreditLimit.deposit(3090, 3000);
        if (testCreditLimit.getBalance() == 1000) {
            System.out.println("testThenAddSumBiggerThenLoanDebt TEST OK");
        } else {
            System.out.println("testThenAddSumBiggerThenLoanDebt TEST FAIL");
        }
    }

}


