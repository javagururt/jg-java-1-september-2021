package com.javaguru.teacher.lesson_13_design.lessoncode.dependencies;

class ElectricEngine implements Engine {

    private String model;
    private double chargeLevel;

    public ElectricEngine(String model, double chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
    }

    @Override
    public String getModelName() {
        return model;
    }
}
