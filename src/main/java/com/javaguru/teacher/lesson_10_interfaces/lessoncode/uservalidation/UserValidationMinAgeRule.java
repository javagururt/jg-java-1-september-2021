package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationMinAgeRule implements UserValidationRule {
    @Override
    public boolean isValid(User user) {
        if (user.getAge() < 18) {
            return false;
        }
        return true;
    }
}
