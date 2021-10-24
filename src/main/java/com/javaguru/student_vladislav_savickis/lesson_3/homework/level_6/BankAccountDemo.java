package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000000, "Viktor");
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
