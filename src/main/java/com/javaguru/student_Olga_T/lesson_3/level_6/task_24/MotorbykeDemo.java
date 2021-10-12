package com.javaguru.student_Olga_T.lesson_3.level_6.task_24;

public class MotorbykeDemo {
    public static void main(String[] args) {
        Motorbyke motorbyke1 = new Motorbyke("Honda", "red", 3000);
        Motorbyke motorbyke2 = new Motorbyke("Yamaha", "black", 13700);
        Motorbyke motorbyke3 = new Motorbyke("Suzuki", "white", 15500);
        motorbyke1.motorbykesInfo();
        motorbyke2.motorbykesInfo();
        motorbyke3.motorbykesInfo();
        String oldMotorbykeColor = motorbyke3.getMotorbykesColor();
        motorbyke3.changedColor("yellow");
        System.out.println("We changed motorbyke " + motorbyke3.motorbykesModel + " color from " + oldMotorbykeColor + " to " + motorbyke3.getMotorbykesColor() + ".");
        motorbyke3.motorbykesInfo();
    }
}
