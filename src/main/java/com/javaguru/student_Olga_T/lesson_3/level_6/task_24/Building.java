package com.javaguru.student_Olga_T.lesson_3.level_6.task_24;

public class Building {
    String buildingsName;
    int numbersOfFloors;
    double buildingsAmount;

    public Building(String buildingsName, int numbersOfFloors, double buildingsAmount) {
        this.buildingsName = buildingsName;
        this.numbersOfFloors = numbersOfFloors;
        this.buildingsAmount = buildingsAmount;
    }

    void pricesOfBuildings() {
        this.buildingsAmount = this.buildingsAmount - this.buildingsAmount / 10;
    }

    void buildingsInfo() {
        System.out.println("This building`s name is " + this.buildingsName + ", it is " + this.numbersOfFloors + " floors and it costs " + this.buildingsAmount + " EUR.");
    }
}
