package com.javaguru.student_jekaterina_ola.lesson_3.level_4.task_17;

/*Найти ошибку в коде.
        Исправить и запустить программу.
*/

class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {

        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {return this.ownerFirstName; }
    public String getOwnerLastName() {return this.ownerFirstName; }
    public int getMoneyAmount() {return this.moneyAmount; }

}



