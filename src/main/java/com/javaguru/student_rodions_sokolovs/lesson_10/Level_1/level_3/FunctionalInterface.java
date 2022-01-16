package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3;

public interface FunctionalInterface {

    default int defaultMethod() {
        return 0;
    }

    void method();
}
///это интерфейс у которого только один абстрактный метод.