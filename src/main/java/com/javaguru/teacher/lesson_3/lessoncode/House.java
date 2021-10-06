package com.javaguru.teacher.lesson_3.lessoncode;

class House {
    private int apartmentCount;
    private String location;

    public House(int apartmentCount, String location) {
        this.apartmentCount = apartmentCount;
        this.location = location;
    }

    public int getApartmentCount() {
        return apartmentCount;
    }

    public void setApartmentCount(int apartmentCount) {
        this.apartmentCount = apartmentCount;
    }

    public String getLocation() {
        return location;
    }
}
