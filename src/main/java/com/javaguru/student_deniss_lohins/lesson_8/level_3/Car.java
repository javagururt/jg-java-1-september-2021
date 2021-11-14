package com.javaguru.student_deniss_lohins.lesson_8.level_3;
/*
Исправьте код программы так, что бы он компилировался.
Класс Car менять нельзя. Классы ElectricCar и PetrolCar менять можно.
Классы ElectricCar и PetrolCar должны наследоваться от класса Car.
 */
abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {
        batteryCharge = batteryCharge - 5;
    }

}

class PetrolCar extends Car {

    private double petrollevelInTank;

    public PetrolCar(double petrolTankCapacity) {
        this.petrollevelInTank = petrolTankCapacity;
    }

    @Override
    void accelerate() {
        petrollevelInTank = petrollevelInTank - 3;
    }



}