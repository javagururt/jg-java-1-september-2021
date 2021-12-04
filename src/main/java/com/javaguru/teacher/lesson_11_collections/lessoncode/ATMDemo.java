package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.List;

class ATMDemo {

    public static void main(String[] args) {
        ATM atm = new ATM();

        Card card = new Card();
        card.setPin("0123");
        card.setCardNumber("5555");

        int attempts = 2;
        while (true) {
            boolean loggedIn = atm.login(card);

            if (loggedIn || attempts == 0) {
                break;
            } else {
                attempts--;
            }
        }

        List<LoginAttempt> history = atm.findLoginHistoryByCardNumber("5555");
        for (LoginAttempt loginAttempt : history) {
            System.out.println(loginAttempt);
        }
    }
}
