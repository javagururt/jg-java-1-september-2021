package com.javaguru.student_nikita_simans.homework.lesson_9.level_1;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("admin123", 2310);
        System.out.println("Money amount: " + safe.getMoneyAmount());
        System.out.println("PWD: " + safe.getPassword());
    }
}
