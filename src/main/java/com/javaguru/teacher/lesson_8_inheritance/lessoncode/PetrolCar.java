package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class PetrolCar extends CarBase {

    private double tankVolume;

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }
}
