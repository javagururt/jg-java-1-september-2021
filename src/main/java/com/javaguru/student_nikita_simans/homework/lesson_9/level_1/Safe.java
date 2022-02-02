package com.javaguru.student_nikita_simans.homework.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe {
    String password;
    double moneyAmount;

    public Safe(String password, double moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
