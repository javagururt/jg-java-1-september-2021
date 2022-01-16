package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2;

public class ApplesLights implements ApplePredicate {
    public boolean test(Apple apple) {
        if (apple.getWeight() < 150) {
            return true;
        }
        return false;
    }
}
