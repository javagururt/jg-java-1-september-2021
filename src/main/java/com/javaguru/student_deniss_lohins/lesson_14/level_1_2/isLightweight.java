package com.javaguru.student_deniss_lohins.lesson_14.level_1_2;

class isLightweight implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight() < 150){
            return true;
        }
        return false;
    }
}
