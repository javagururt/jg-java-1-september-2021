package com.javaguru.student_rodions_sokolovs.lesson_9.level_1.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String name, int parameter) {
        this("Name");
        this.constructorName = name;
        this.parameterCount = parameter;

    }
}