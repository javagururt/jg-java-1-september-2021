//Найти логическую ошибку в коде.
//Исправить и запустить программу так, что бы она выводила
//на консоль владельца банковского счёта и количество денег.
//Менять можно только класс BankAccount.

package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner,int moneyamount) {
        this.owner = owner;
        this.money = moneyamount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 1000000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
