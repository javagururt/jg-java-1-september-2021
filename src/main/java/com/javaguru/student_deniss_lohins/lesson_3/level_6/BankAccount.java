package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import java.math.BigDecimal;

/*
        Найти логическую ошибку в коде.
        Исправить и запустить программу так, что бы она выводила
        на консоль владельца банковского счёта и количество денег.
        Менять можно только класс BankAccount.
*/
class BankAccount {

    private String ownerFirstName;
    private String owner;
    private BigDecimal money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 1000000);
        String ownerFirstName = bankAccount.getOwner();
        BigDecimal moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}

