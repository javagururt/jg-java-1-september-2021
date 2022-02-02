package com.javaguru.student_rodions_sokolovs.lesson_8.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
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