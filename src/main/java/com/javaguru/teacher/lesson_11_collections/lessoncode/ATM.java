package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ATM {

    private Map<String, List<LoginAttempt>> history = new HashMap<>();

    public boolean login(Card card) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pin:");
        String pin = scanner.nextLine();

        if (card.getPin().equals(pin)) {
            System.out.println("Success login");
            addLoginAttempt(card.getCardNumber(), "SUCCESS");
            return true;
        } else {
            System.out.println("Failed to login");
            addLoginAttempt(card.getCardNumber(), "FAILED");
            return false;
        }
    }

    public List<LoginAttempt> findLoginHistoryByCardNumber(String cardNumber) {
        return history.get(cardNumber);
    }

    private void addLoginAttempt(String cardNumber, String status) {
        List<LoginAttempt> attempts = history.get(cardNumber);
        if (attempts == null) {
            attempts = new ArrayList<>();
        }
        attempts.add(new LoginAttempt(cardNumber, status));
        history.put(cardNumber, attempts);
    }
}
