package com.javaguru.student_deniss_lohins.lesson_3.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

/*
Найти ошибку в коде.
Исправить и запустить программу.
 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "если переменная не используется, то ее лучше удалить")
class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;
    private int money;

    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.money = moneyAmount;
    }

    public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public String getOwnerLastName() {
        return this.ownerLastName;
    }

    public int getMoneyAmount() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}

