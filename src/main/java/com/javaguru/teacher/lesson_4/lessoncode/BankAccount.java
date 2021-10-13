package com.javaguru.teacher.lesson_4.lessoncode;

import java.math.BigDecimal;

public class BankAccount {

    private String owner;
    private BigDecimal balance;

    public BankAccount(String owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

}