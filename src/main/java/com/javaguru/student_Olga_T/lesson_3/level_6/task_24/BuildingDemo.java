package com.javaguru.student_Olga_T.lesson_3.level_6.task_24;

public class BuildingDemo {
    public static void main(String[] args) {
        Building building1 = new Building("ABC", 11, 9000000);
        Building building2 = new Building("foo", 3, 30000);
        Building building3 = new Building("bar", 9, 7400000);
        building1.buildingsInfo();
        building2.buildingsInfo();
        building3.buildingsInfo();
        System.out.println("We have an offer for you today. You can buy the building 'foo' with 10% discount:");
        building2.pricesOfBuildings();
        building2.buildingsInfo();

    }
}
