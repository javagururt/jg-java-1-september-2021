package com.javaguru.student_jekaterina_ola.lesson_3.level_6.Task_28;

public class Computer {
    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer(){return this.manufacturer;}

    public String getModel(){return this.model;}
}
