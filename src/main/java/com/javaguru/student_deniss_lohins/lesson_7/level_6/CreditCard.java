package com.javaguru.student_deniss_lohins.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCard {
    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        creditDebt = 0;
        creditLimit = 0;
    }

    public void deposit(double amount, String code) {
        if (code.equals(pinCode)) {
            if (creditDebt < 0) {
                if (Math.abs(creditDebt) <= amount) {
                    balance = balance + creditDebt + amount;
                    creditDebt = 0;
                } else {
                    creditDebt = creditDebt + amount;
                }
            } else {
                balance = balance + amount;
            }
        } else {
            System.err.println("Pin code incorrect!");
        }
    }

    public void withdraw(double amount, String code) {
        if (code.equals(pinCode)) {
            if (balance >= amount) {
                balance = balance - amount;
            } else if (Math.abs(creditDebt + balance - amount) < creditLimit) {
                creditDebt = creditDebt + balance - amount;
                balance = 0;
            } else {
                System.err.println("There are not enough funds to perform this operation!");
            }
        } else {
            System.err.println("Pin code incorrect!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
