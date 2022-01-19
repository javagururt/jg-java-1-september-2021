package com.javaguru.student_nikita_simans.homework.lesson_9.level_1;

class Safe2 {
    private String password;
    private Double amount;

    public Safe2(String password, Double amount) {
        this.password = password;
        this.amount = amount;
    }

    public void getMoney(String password) {
        if (this.password.equals(password)){
            System.out.println("Current money amount: " +  amount);
        }else{
            System.out.println("Incorrect password!");

        }

    }

    public void putMoney(String password, Double amount) {
        if (this.password.equals(password)){
            this.amount = this.amount + amount;
            System.out.println("Money added successfully. Current money amount is: " + this.amount);
        }else{
            System.out.println("Incorrect password!");
        }
    }
}
