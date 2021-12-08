package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

class UserValidationService {

    void validate(User user) {
        if (user == null) {
            throw new UserValidationException("User must not be null.");
        }
    }
}
