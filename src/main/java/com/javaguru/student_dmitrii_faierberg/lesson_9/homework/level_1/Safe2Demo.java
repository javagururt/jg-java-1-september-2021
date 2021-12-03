package com.javaguru.student_dmitrii_faierberg.lesson_9.homework.level_1;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe = new Safe2("Bobik", 0);

        safe.putMoney("Bobik", 100);
        double sum = safe.getMoney("Bobik", 70);
        System.out.println("Taken: " + sum);
        System.out.println("Left: " + safe.getMoney("Bobik", 30));
        System.out.println("No money if -1: " + safe.getMoney("Bobik", 1));

    }
}
