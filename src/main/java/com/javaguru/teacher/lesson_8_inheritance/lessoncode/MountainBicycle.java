package com.javaguru.teacher.lesson_8_inheritance.lessoncode;

class MountainBicycle extends Bicycle {

    protected int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }


//    @Override
//    public String toString() {
//        return "MountainBicycle{" +
//                "brand='" + brand + '\'' +
//                ", speed=" + speed +
//                ", gear=" + gear +
//                '}';
//    }


//    @Override
//    public String toString() {
//        return super.toString() + " and gear = " + gear;
//    }


    @Override
    public String toString() {
        return "MountainBicycle{" +
                "gear=" + gear +
                "} " + super.toString();
    }
}
