package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2;

public class AppleisGreenHeavy implements ApplePredicate{
    public boolean test(Apple apple) {
        if(apple.getWeight() > 150 && apple.getColor().equalsIgnoreCase("green")){
            return true;
        }
        return false;
    }
}
