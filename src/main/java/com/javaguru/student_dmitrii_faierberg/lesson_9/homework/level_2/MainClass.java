package com.javaguru.student_dmitrii_faierberg.lesson_9.homework.level_2;

/*
Конструкторы вызываются в порядке наследования, так как родительский класс
ничего не знает о своих детях.
 */

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
