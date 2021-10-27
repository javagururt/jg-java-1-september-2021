package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_3.lessoncode;

class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void printInformation() {
        System.out.println("Bank account information:");
        System.out.println("Owner = " + owner);
        System.out.println("Current balance = " + balance);
    }
}
