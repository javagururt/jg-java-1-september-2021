package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;
/*
Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Car.*/

class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }
    public String getModel() {
        return this.model;
    }
}
class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
