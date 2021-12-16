package com.javaguru.teacher.lesson_13_design.lessoncode.dependencies;

class CarDemo {

    public static void main(String[] args) {
        Engine engine = new PatrolEngine("m57n", 30);
        Car car = new Car(engine);
        System.out.println(car);

        Engine engine2 = new ElectricEngine("new-v-electro", 90);
        Car car2 = new Car(engine2);
        System.out.println(car2);
    }
}
