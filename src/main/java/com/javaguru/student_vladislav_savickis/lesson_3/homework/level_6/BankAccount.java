package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(int moneyAmount, String moneyOwner) {
        this.money = moneyAmount;
        this.owner = moneyOwner;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
