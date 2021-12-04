package com.javaguru.student_ruslan_pankratov.lesson_9.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
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
//Вызван с ,но конструктор начнётся, с А-С
//        Class A Constructor
//        Class B Constructor
//        Class C Constructor