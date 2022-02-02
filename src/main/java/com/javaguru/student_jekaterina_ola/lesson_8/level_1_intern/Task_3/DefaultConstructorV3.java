package com.javaguru.student_jekaterina_ola.lesson_8.level_1_intern.Task_3;

import com.javaguru.teacher.codereview.CodeReview;

// создайте get() методы для каждого свойства
@CodeReview(approved = true)
public class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public boolean isFemale() { return female; }
    public boolean getMale() { return male; }
}
