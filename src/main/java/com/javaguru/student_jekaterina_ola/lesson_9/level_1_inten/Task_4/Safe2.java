package com.javaguru.student_jekaterina_ola.lesson_9.level_1_inten.Task_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe2 {
    private String pinCode;
    private double balance;

    public Safe2(String pinCode, double balance){
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public double getMoney(String pinCode, double sum) {
        if(pinCode.equals(this.pinCode)){
            if (balance >= sum){
                balance -= sum;
                return sum;
            }
        }
        return -1;
    }

    public void putMoney(String piCode, double sum){
        if(pinCode.equals(this.pinCode)){
            balance += sum;
        }
    }
}
