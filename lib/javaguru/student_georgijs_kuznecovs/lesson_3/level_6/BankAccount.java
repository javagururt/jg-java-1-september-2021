package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    private String owner;
    private int money;     // если поле private - его все равно можно задать в конструкторе?

    public BankAccount(String owner, int money) {
        this.owner = owner;         //присваиваем значение
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }   //метод

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