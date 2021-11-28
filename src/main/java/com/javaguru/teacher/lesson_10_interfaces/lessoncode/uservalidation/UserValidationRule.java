package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

public interface UserValidationRule {

    boolean isValid(User user);

    default boolean isNull(User user) {
        return user == null;
    }

}
