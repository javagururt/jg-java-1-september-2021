package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_6.task_24;

class ApartmentDemo {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Riga", 50, 45000);
        apartment1.apartmentsInfo();
        apartment1.changeApartmentsTown("Liepaja");
        apartment1.apartmentsInfo();
        apartment1.changeApartmentsPrice(42000);
        apartment1.changeArea(42);
        apartment1.apartmentsInfo();

    }
}
