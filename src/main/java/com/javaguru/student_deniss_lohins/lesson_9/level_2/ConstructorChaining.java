package com.javaguru.student_deniss_lohins.lesson_9.level_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
public ConstructorChaining(String constructorName, int parameterCount){
        this(constructorName);
        this.parameterCount = parameterCount;

}
    // допишите решение тут

}
/*
    Создайте в этом классе публичный конструктор с двумя параметрами.
        Внутри этого конструктора первой строкой вызовите приватный
        конструктор с одним параметром.

        Более подробно про этот подход можно прочитать:
        https://data-flair.training/blogs/constructor-chaining-in-java/
        https://www.geeksforgeeks.org/constructor-chaining-java-examples/

 */