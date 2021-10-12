package com.javaguru.student_ruslan_pankratov.lesson_3.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Task_27
@CodeReview(approved = true)
class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
@CodeReview(approved = true)
class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);

        System.out.println("Owner = " + bankAccount.getOwner());
        System.out.println("Money = " + bankAccount.getMoney());
    }

}
