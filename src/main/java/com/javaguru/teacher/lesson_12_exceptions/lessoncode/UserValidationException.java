package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

class UserValidationException extends RuntimeException {

    public UserValidationException(String message) {
        super(message);
    }
}
