package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
