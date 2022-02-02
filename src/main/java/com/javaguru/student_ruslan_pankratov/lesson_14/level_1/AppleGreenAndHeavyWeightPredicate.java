package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) { //тут можно даже без иф обойтись, можно сделать проверяемый результат и
        // просто его проверять
        return apple.getColor().equalsIgnoreCase("green") && apple.getWeight() > 150;//не обязятельно
        // иф в такой ситуации создавать
    }
}
