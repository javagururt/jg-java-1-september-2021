package com.javaguru.student_nikita_simans.homework.lesson_14.lesson_1_and_2;

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight() > 150 && apple.getColor().equalsIgnoreCase("green")){
            return true;
        }
        return false;
    }

}
