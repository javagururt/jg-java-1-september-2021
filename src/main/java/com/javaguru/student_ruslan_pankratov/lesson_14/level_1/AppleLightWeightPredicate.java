package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}