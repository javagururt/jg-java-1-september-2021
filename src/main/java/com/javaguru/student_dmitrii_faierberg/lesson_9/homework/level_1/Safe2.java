package com.javaguru.student_dmitrii_faierberg.lesson_9.homework.level_1;

class Safe2 {
    private String password;
    private double balance;

    public Safe2(String password, double balance){
        this.password = password;
        this.balance = balance;
    }

    public double getMoney(String password, double sum){
        if (password.equals(this.password)){
            if (balance >= sum){
                balance -= sum;
                return sum;
            }
        }
        return -1;
    }

    public void putMoney(String password, double sum){
        if (password.equals(this.password)){
            balance += sum;
        }
    }
}
