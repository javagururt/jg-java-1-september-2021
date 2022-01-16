package com.javaguru.student_rodions_sokolovs.lesson_8.level_3;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    void accelerate() {

    }
}