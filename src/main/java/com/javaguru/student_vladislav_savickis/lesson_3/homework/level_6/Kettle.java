package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Kettle {
    private String manufacturer;
    private double volume;
    private int power;

    Kettle(String kettleManufacturer, double kettleVolume, int kettlePower){
        this.manufacturer = kettleManufacturer;
        this.volume = kettleVolume;
        this.power = kettlePower;
    }

    public void kettleInfo() {
        System.out.println("Kettle manufacturer: " + manufacturer);
        System.out.println("Kettle volume: " + volume);
        System.out.println("Kettle power: " + power + " W");
    }
}
