package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

import java.math.BigDecimal;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", new BigDecimal("1000000"));
        String ownerFirstName = bankAccount.getOwner();
        BigDecimal moneyAmount = bankAccount.getBalance();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}