package com.javaguru.student_deniss_lohins.lesson_14.level_1_2;

class isRed implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        if(apple.getColor().equalsIgnoreCase("red")){
            return true;
        }
        return false;
    }
}
