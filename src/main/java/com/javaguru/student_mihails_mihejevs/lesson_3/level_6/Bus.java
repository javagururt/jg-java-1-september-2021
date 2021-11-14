package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

class Bus {

    private int busCapacity;
    private boolean busIsStarted;
    private boolean busIsOpen;

    public Bus(int capacity, boolean isStarted, boolean isOpen){
        this.busCapacity = capacity;
        this.busIsStarted = isStarted;
        this.busIsOpen = isOpen;
    }
    public void getCapacity(){
        System.out.println("Bus capacity is - " + busCapacity);
    }
    public void startedOn() {
        this.busIsStarted = true;
        System.out.println("Bus is started!");
    }
    public void startedOff() {
        this.busIsStarted = false;
        System.out.println("Bus is muffled!");
    }
    public void isOpen() {
        this.busIsOpen = true;
        System.out.println("Bus is open!");
    }
    public void isClosed() {
        this.busIsOpen = false;
        System.out.println("Bus is closed!");
    }
    public void changeCapacity(int newCapacity) {
        this.busCapacity = newCapacity;
        System.out.println("Bus capacity is - " + busCapacity);
    }

}
