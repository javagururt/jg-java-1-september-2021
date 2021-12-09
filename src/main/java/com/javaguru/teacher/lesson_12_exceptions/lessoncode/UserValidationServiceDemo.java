package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

class UserValidationServiceDemo {

    public static void main(String[] args) {
        UserValidationService validationService = new UserValidationService();

        User user = null;
        validationService.validate(user);
    }
}
