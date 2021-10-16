package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_6.task_24;

class Apartment {
    String apartmentsTown;
    int apartmentsArea;
    int apartmentsPrice;

    public Apartment(String apartmentsTown, int apartmentsArea, int apartmentsPrice){
        this.apartmentsTown = apartmentsTown;
        this.apartmentsArea = apartmentsArea;
        this.apartmentsPrice = apartmentsPrice;


    }
    void changeArea(int newApartmentsArea){
        this.apartmentsArea = newApartmentsArea;
    }
    void changeApartmentsPrice(int newApartmentsPrice){
        this.apartmentsPrice = newApartmentsPrice;
        System.out.println("New price is " +apartmentsPrice);
    }
    void changeApartmentsTown(String newApartmentsTown){
        this.apartmentsTown = newApartmentsTown;
        System.out.println("Apartment's Town changed to " +apartmentsTown);
    }
    void apartmentsInfo(){
        System.out.println("Apartment's Town is " +apartmentsTown);
        System.out.println("Apartment's area is " +apartmentsArea);
        System.out.println("Apartment's price is " +apartmentsPrice);
    }

}
