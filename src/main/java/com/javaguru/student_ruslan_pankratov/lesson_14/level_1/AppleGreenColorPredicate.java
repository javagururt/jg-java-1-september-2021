package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}
