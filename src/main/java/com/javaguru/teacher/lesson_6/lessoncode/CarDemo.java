package com.javaguru.teacher.lesson_6.lessoncode;

class CarDemo {

    public static void main(String[] args) {
        Car firstCar = new Car("BMW");
        Car secondCar = new Car("BMW");

        boolean sameResult = firstCar == secondCar;
        boolean equalsResult = firstCar.equals(secondCar);

        System.out.println("Same result: " + sameResult);
        System.out.println("Equals result: " + equalsResult);

        int a = 10;
        int b = 4;
        double result = a / (double) b;
        System.out.println(result);
    }
}
