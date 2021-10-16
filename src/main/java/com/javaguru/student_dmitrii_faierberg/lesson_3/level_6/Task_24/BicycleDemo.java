package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6.Task_24;

class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.setTransmission(12);
        bike.setTransmission(3);
        bike.ride();
        bike.ride();
        bike.setTransmission(7);
        bike.stop();
        bike.stop();
        bike.ride();
        bike.stop();


    }
}
