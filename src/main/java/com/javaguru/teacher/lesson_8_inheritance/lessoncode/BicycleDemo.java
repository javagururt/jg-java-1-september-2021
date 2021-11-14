package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("ZZK", 10);
        bicycle.accelerate();
        bicycle.decelerate();

        MountainBicycle mountainBicycle = new MountainBicycle("ZZK", 0, 0);
        mountainBicycle.accelerate();
        mountainBicycle.decelerate();

        System.out.println(bicycle);
        System.out.println(mountainBicycle);
    }
}
