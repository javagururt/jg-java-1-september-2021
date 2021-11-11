package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class CarDemo {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBattery(100);
        electricCar.setColor("Red");

        CarBase carBase = new CarBase();
        carBase.setColor("Black");
    }
}
