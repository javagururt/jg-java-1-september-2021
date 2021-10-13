package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_4;

class BankAccount {
    private String firstName;
    private String lastName;
    private int money;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.firstName = ownerFirstName;
        this.lastName = ownerLastName;
        this.money = moneyAmount;
    }

    public String getOwnerFirstName() {
        return this.firstName;
    }

    public String getOwnerLastName() {
        return this.lastName;
    }

    public int getMoneyAmount() {
        return this.money;
    }
}
