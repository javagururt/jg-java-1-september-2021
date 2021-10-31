package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

class SwitchExample {

    public void foo(String drink) {
        switch (drink) {
            case "juice":
            case "coffee":
                System.out.println("A");
                break;
            case "tea":
                System.out.println("B");
                break;
            case "water":
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }
}
