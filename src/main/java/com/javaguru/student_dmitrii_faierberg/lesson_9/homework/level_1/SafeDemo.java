package com.javaguru.student_dmitrii_faierberg.lesson_9.homework.level_1;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.balance = 1000000;
        safe.password = 0;
        System.out.println("Balance: " + safe.balance);
        System.out.println("Password: " + safe.password);
    }
}
