package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;


@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}

//Интерфейс ApplePredicate является функциональным интерфейсом.
//
//В Java функциональным интерфейсом является тот интерфейс,
//у которого есть всего один метод.
//
//У интерфейса ApplePredicate есть только один метод test().
//Поэтому он является функциональным интерфейсом!
//
//Для обозначения функциональных интерфейсов в Java применяется
//аннотация @FunctionalInterface: