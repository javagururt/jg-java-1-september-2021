package com.javaguru.student_dmitrii_faierberg.lesson_10.level_3;

/*
Функциональный интерфейс может иметь только 1 абстрактный метод и дополнительно
содержать абстрактные методы, определенные в классе Object.
Основное назначение – использование в лямбда-выражениях и method reference.
 */

@FunctionalInterface
public interface UnaryOperationOnInt {
    int apply(int t);
    boolean equals(Object obj);
}
