package com.javaguru.student_deniss_lohins.lesson_9.level_1;

class Safe {
    String password;
    double amount;

    public Safe(String password, double amount) {
        this.password = password;
        this.amount = amount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
