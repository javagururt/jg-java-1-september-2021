package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

class Vehicle {
    String type;
    int speed;
    String comfort;
    int price;

    Vehicle(String type, int speed, String comfort, int price){
        this.type = type;
        this.speed = speed;
        this.comfort = comfort;
        this.price = price;
    }

    void descriptoin() {
        System.out.println("This is a " + type + "!");
        System.out.println("It reach maximum speed of " + speed + " km/h,");
        System.out.println("it is " + comfort + " to use it every day");
        System.out.println("and you'll spend around " + price + " eur yearly, using it every day.");
        System.out.println("But it has more advantages!!!");
        System.out.println();
    }
}
