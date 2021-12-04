package com.javaguru.student_ruslan_pankratov.lesson_9.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;

    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this("Param");
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }


}
