package com.javaguru.teacher.lesson_13_design.lessoncode.dependencies;

class PatrolEngine implements Engine {

    private String model;
    private double volume;

    public PatrolEngine(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }

    @Override
    public String getModelName() {
        return model;
    }
}
