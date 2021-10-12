package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 200, "very comfortable", 4700);
        car.descriptoin();
        Vehicle tram = new Vehicle("Tram", 50, "comfortable enough", 600);
        tram.descriptoin();
        Vehicle bicycle = new Vehicle("Bicycle", 35, "uncomfortable", 300);
        bicycle.descriptoin();

    }
}
