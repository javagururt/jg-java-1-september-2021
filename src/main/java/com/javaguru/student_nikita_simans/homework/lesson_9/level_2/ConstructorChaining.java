package com.javaguru.student_nikita_simans.homework.lesson_9.level_2;

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
