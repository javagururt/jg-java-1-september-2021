package com.javaguru.student_deniss_lohins.lesson_9.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Какой будет результат выполнения следующей программы?
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

    /*
    Объект создаётся от старшего поколения вниз, то есть  А->B->C
     */
}

   /* Напишите этот код и запустите MainClass.
        В коментариях к MainClass напишите почему получился такой результат,
        который вы увидите на консоли после запуска программы.

    */