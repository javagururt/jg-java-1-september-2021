package com.javaguru.teacher.lesson_3.lessoncode;

class HouseApplication {

    public static void main(String[] args) {
        House myHouse = new House(5, "Latvia, Riga");
//        myHouse.apartmentCount = 10;
//        myHouse.location = "Latvia, Riga";

        System.out.println("House apartments = " + myHouse.getApartmentCount());
        System.out.println("House location = " + myHouse.getLocation());

//        myHouse.setLocation("Latvia, Ventspils");
        myHouse.setApartmentCount(10);

        System.out.println("House apartments = " + myHouse.getApartmentCount());
        System.out.println("House location = " + myHouse.getLocation());

    }
}
