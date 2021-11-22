package com.javaguru.student_deniss_lohins.lesson_9.level_1;

import java.math.BigDecimal;

class Safe2 {
    private String password;
    private Double amount;

    public Safe2(String password, Double amount) {
        this.password = password;
        this.amount = amount;
    }

    public void getMoney(String password) {
        if (this.password == password){
            System.out.println("There are " +  amount + " money in safe.");
        }else{
            System.err.println("Wrong password!");

        }

    }

    public void putMoney(String password, Double amount) {
        if (this.password == password){
            this.amount = this.amount + amount;
            System.out.println("Money was put in safe2.");
        }else{
            System.err.println("Wrong password! no put in safe");
        }
    }
}
