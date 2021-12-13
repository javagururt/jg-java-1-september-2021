package com.javaguru.student_Olga_T.lesson_7.level_6.task_10;

class CreditCard {
    private String cardNumber;
    private int securityCode;
    private double balance; // поменять на BigDecimal. Начальный баланс и задолженность по кредиту равны 0.
    private double creditLimit;
    private double loanDebt;

    public CreditCard(String cardNumber, int securityCode) {
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.balance = 0;
        this.loanDebt = 0;
        this.creditLimit = 2000;
    }

    public boolean deposit(int securityCode, double moneyAdd) {
        if (this.securityCode != securityCode) {
            return false;
        }
        if (this.loanDebt == 0) {
            this.balance = this.balance + moneyAdd;
        } else if (this.loanDebt >= moneyAdd) {
            this.balance = this.loanDebt - moneyAdd;
        } else {
            this.balance = moneyAdd - this.loanDebt;
            this.loanDebt = 0;
        }
        return true;
    }

    public boolean withdraw(int securityCode, double moneyBack) {
        if (this.securityCode != securityCode) {
            return false;
        }
        if (moneyBack > (this.balance + this.creditLimit)) {
            return false;
        } else if (this.balance > moneyBack) {
            this.balance = this.balance - moneyBack;
        } else {
            this.loanDebt = this.loanDebt + (moneyBack - this.balance);
            this.balance = 0;
        }
        return true;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getLoanDebt() {
        return this.loanDebt;
    }

}




