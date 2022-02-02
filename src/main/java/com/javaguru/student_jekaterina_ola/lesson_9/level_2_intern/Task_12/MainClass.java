package com.javaguru.student_jekaterina_ola.lesson_9.level_2_intern.Task_12;

import com.javaguru.teacher.codereview.CodeReview;

//класс наследования. родительский класс ничего не знает о своих детях
@CodeReview(approved = true)
class A {
    public A() { System.out.println("Class A Constructor"); }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}

