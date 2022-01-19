package com.javaguru.student_nikita_simans.homework.lesson_9.level_1;


class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe = new Safe2("password123", 123.0);
        safe.putMoney("password123", 27.0);
        safe.getMoney("password123");
        safe.getMoney("Password123");
        safe.getMoney("12345678");
        safe.putMoney("admin123", 100.0);

    }
}
