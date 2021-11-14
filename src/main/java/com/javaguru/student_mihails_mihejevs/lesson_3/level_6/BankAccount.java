package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}
