package com.javaguru.student_dmitrii_faierberg.lesson_8.level_3;

class ElectricCar extends Car {

    private int batteryCharge;
    ElectricCar(int batteryCharge) { this.batteryCharge = batteryCharge; }
    @Override
    void accelerate() {
        System.out.println("silence....");
        batteryCharge--;
    }
}
