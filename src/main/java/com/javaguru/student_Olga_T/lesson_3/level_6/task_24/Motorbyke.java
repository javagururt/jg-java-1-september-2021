package com.javaguru.student_Olga_T.lesson_3.level_6.task_24;

public class Motorbyke {
    String motorbykesModel;
    String motorbykesColor;
    int motorbykesAmount;

    public Motorbyke(String motorbykesModel, String motorbykesColor, int motorbykesAmount) {
        this.motorbykesModel = motorbykesModel;
        this.motorbykesColor = motorbykesColor;
        this.motorbykesAmount = motorbykesAmount;
    }

    public String getMotorbykesColor() {
        return this.motorbykesColor;
    }

    void changedColor(String newMotorbykeColor) {
        this.motorbykesColor = newMotorbykeColor;
    }

    void motorbykesInfo() {
        System.out.println("This is " + motorbykesModel + ", " + motorbykesColor + " color motorbyke, it costs " + motorbykesAmount + " EUR.");
    }
}
