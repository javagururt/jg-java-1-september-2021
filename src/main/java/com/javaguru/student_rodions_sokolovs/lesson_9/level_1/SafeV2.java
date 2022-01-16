package com.javaguru.student_rodions_sokolovs.lesson_9.level_1;

public class SafeV2 {
    public int password;
    public int money;

    public SafeV2(int password, int money) {
        this.password = password;
        this.money = money;

    }

    void getMoney(int password, int getMoney) {
        if (this.password == password) {
            money = money - getMoney;
            System.out.println("Your Money: " + money);
        } else {
            System.out.println("Wrong password! Please retry.");
        }
    }

    void putMoney(int password, int getMoney) {
        if (this.password == password) {
            money = money - getMoney;
            System.out.println("New Balance: " + money);
        } else {
            System.out.println("Wrong password! Please retry.");
        }
    }

}
