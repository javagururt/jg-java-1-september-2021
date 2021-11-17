package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TrafficLightDemo {

    public static void main(String[] args) {

    TrafficLight luksofor1 = new TrafficLight(true, "green");
    String signal1 = luksofor1.getSignal();
        System.out.println("Luksofor1 signal - " + signal1);
    luksofor1.changeColor("yellow");
    String signal2 = luksofor1.getSignal();
        System.out.println("Luksofor1 signal - " + signal2);
    luksofor1.changeColor("red");
        String signal3 = luksofor1.getSignal();
        System.out.println("Luksofor1 signal - " + signal3);
    luksofor1.switchOff();

    TrafficLight luksofor2 =new TrafficLight(false, "no light");
        luksofor2.switchOn();
    luksofor2.changeColor("yellow");
        String signal4 = luksofor2.getSignal();
        System.out.println("Luksofor2 signal - " + signal4);
    luksofor2.changeColor("yellow");
        String signal5 = luksofor2.getSignal();
        System.out.println("Luksofor2 signal - " + signal5);
    luksofor1.switchOff();
    }
}
