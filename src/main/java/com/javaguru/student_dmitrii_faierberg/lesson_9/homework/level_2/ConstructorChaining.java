package com.javaguru.student_dmitrii_faierberg.lesson_9.homework.level_2;

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

}