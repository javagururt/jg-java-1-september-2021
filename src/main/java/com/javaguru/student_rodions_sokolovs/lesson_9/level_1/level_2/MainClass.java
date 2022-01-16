package com.javaguru.student_rodions_sokolovs.lesson_9.level_1.level_2;

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
//Вызываеться конструктор с C но идет по очередно с А до C