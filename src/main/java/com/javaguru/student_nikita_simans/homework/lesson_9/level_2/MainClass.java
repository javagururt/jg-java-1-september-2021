package com.javaguru.student_nikita_simans.homework.lesson_9.level_2;

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

        /*
    Каждый последующий класс включает в себя "наследие" предыдущего и добавляет свое. Поэтому при
    выводе на консоль мы видим и "результат работы" родительского класса (В), который, в свою очередь
    сам унаследован от класса А. В коде ниже можно видеть, как строки "поэтапно" добавляются в результате наследования.
     */

        System.out.println("--------------");
        System.out.println("Class A");
        A a = new A();
        System.out.println("--------------");
        System.out.println("Class B");
        B b = new B();
    }


}
