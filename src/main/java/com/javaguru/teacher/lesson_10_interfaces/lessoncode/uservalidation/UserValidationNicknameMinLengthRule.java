package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationNicknameMinLengthRule implements UserValidationRule{
    @Override
    public boolean isValid(User user) {
        if (user.getNickname().length() < 4) {
            return false;
        }
        return true;
    }
}
