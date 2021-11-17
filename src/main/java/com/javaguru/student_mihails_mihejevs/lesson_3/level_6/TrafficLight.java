package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TrafficLight {

    private boolean isOn;
    private String signal;

    public TrafficLight(boolean isSwitchedOn, String signalColor){
        this.isOn = isSwitchedOn;
        this.signal = signalColor;
    }
    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched ON!");
    }
    public void switchOff() {
        this.isOn = false;
        System.out.println("Switched OFF!");
    }
    public String getSignal(){
        return this.signal;
    }
    public void changeColor(String newSignal) {
        this.signal = newSignal;
    }
}
