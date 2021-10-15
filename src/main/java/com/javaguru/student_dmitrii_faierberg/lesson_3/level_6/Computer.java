package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

class Computer {
    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){ return manufacturer; }
    String getModel() { return model; }
}
