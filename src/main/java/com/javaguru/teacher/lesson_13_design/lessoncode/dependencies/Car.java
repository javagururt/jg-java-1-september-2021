package com.javaguru.teacher.lesson_13_design.lessoncode.dependencies;

class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
