package com.javaguru.student_jekaterina_ola.lesson_9.level_1_inten.Task_4;

public class Safe2Demo {
    public static void main (String[] args){
        Safe2 safe = new Safe2("qwerty", 0);

        safe.putMoney("qwerty", 1000);
        double sum = safe.getMoney("qwerty", 110);
        System.out.println("Withdraw" + sum);
        System.out.println("Remaining: " + safe.getMoney("qwerty", 890));
        System.out.println("A/C in debt if -1" + safe.getMoney("qwerty", 1));

    }
}
