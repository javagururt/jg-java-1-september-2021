package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.time.LocalDateTime;

class LoginAttempt {

    private String cardNumber;
    private String status;
    private LocalDateTime loginAttemptTime;

    public LoginAttempt(String cardNumber, String status) {
        this.cardNumber = cardNumber;
        this.status = status;
        this.loginAttemptTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "LoginHistory{" +
                "cardNumber='" + cardNumber + '\'' +
                ", status='" + status + '\'' +
                ", loginAttemptTime=" + loginAttemptTime +
                '}';
    }
}
