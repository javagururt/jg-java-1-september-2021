package com.javaguru.student_dmitrii_faierberg.lesson_14.level_1_2;

class AppleHeavyWeightPredicate implements ApplePredicate{
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }
}

