package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationNicknameMaxLengthRule implements UserValidationRule {

    @Override
    public boolean isValid(User user) {
        if (user.getNickname().length() > 10) {
            return false;
        }
        return true;
    }

}
