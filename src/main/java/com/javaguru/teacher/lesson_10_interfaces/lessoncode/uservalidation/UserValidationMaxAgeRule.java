package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationMaxAgeRule implements UserValidationRule {
    @Override
    public boolean isValid(User user) {
        if (user.getAge() > 120) {
            return false;
        }
        return true;
    }
}
