package com.javaguru.student_jekaterina_ola.lesson_3.level_6.task_24;

public class RadioDemo {
    public static void main(String[] args){
        Radio firstRadio = new Radio("VEF", 35, 60);
        String radioName = firstRadio.getBrand();
        double radioCost = firstRadio.getCost();
        int radioVolume = firstRadio.getVolume();
        firstRadio.radioInfo();

    }
}