package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationCapitalLetterNicknameRule implements UserValidationRule {
    @Override
    public boolean isValid(User user) {
        if (isNull(user)) {
            return false;
        }
        if (!isStartedWithCapitalLetter(user.getNickname())) {
            return false;
        }
        return true;
    }

    private boolean isStartedWithCapitalLetter(String nickname) {
        char firstLetter = nickname.charAt(0);
        return Character.isUpperCase(firstLetter);
    }
}
