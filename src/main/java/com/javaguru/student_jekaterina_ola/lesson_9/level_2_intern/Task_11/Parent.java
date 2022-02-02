package com.javaguru.student_jekaterina_ola.lesson_9.level_2_intern.Task_11;

import com.javaguru.teacher.codereview.CodeReview;

//Создайте иерархию наследования из двух уровней (родительский и дочерний).
//        Продемонстрируйте использование протектед конструктора в родительском классе.
//        Продемонстрируйте вызов протектед конструктора из класса потомка.
@CodeReview(approved = true)
public class Parent {

    int i;
    protected Parent(int i){
        this.i = i;}
}
