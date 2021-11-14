package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

class BusDemo {
    public static void main(String[] args) {
        Bus bus1 = new Bus(50, false, false);

        bus1.startedOn();
        bus1.isOpen();
        bus1.changeCapacity(65);

        Bus bus2 = new Bus(35, true, true);

        bus2.startedOff();
        bus2.isClosed();
    }
}
