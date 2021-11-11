package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class Bicycle extends Object {

    protected String brand;
    protected int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }

//    @Override
//    public String toString() {
//        return "Bicycle brand is " + brand + " speed = " + speed;
//    }


    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
