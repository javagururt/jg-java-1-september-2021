package com.javaguru.student_jekaterina_ola.lesson_7.level_6_middle.Task_10_12;

import com.javaguru.teacher.codereview.CodeReview;

//Свойства
//        -Номер карты
//        -Пин-код карты
//        -Баланс
//        -Кредитный лимит
//        -Задолженность по кредиту
@CodeReview(approved = true)
public class CreditCard {
    String cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;


    public String getCardNumber() { return cardNumber; }
    public double getBalance() { return balance; }
    public double getCreditLimit() { return creditLimit; }
    public double getCreditDebt() { return creditDebt; }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public CreditCard(String cardNumber, int pinCode) {
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
        balance = 0;
        creditLimit = 0;
        creditDebt = 0;
    }

    public void deposit (String code, double amount){
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
            System.err.println("Incorrect Pin Code");
        }
    }

    public void withdraw (String code, double amount){
        if (code.equals(pinCode)) {
            if (balance >= amount) {
                balance = balance - amount;
            } else if (Math.abs(creditDebt + balance - amount) < creditLimit) {
                creditDebt = creditDebt + balance - amount;
                balance = 0;
            } else {
                System.err.println("There are not enough funds to complete the operation.");
            }
        } else {
            System.err.println("Incorrect Pin Code");
        }
    }
}
