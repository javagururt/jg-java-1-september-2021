package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    private String carManufacturer;
    private String carColour;
    private int carAge;
    private double carPrice;

    public Car(String carManufacturer, String carColour, int carAge, double carPrice) {
        this.carManufacturer = carManufacturer;
        this.carColour = carColour;
        this.carAge = carAge;
        this.carPrice = carPrice;
    }

    void properties() {
        System.out.println("Car manufacturer is " + carManufacturer);
        System.out.println("Car colour is " + carColour);
        System.out.println("Car age is " + carAge + " years");
        System.out.println("Car price is " + carPrice + " €");
    }
}
