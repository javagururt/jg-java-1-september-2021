package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class ValidationService {

    private UserValidationRule[] validationRules;

    public ValidationService(UserValidationRule[] validationRules) {
        this.validationRules = validationRules;
    }

    boolean validate(User user) {
        for (UserValidationRule rule : validationRules) {
            if (!rule.isValid(user)) {
                return false;
            }
        }
        return true;
    }

}
