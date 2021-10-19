package com.javaguru.student_jekaterina_ola.lesson_3.level_6.Task_24;

// марка
// стоимость
// мощность

public class Radio {
    private String brand;
    private double cost;
    private int volume;

    public Radio(String brand, double cost, int volume){
        this.brand= brand;
        this.cost=cost;
        this.volume=volume;
    }

    public String getBrand(){return this.brand;}
    public double getCost(){return this.cost;}
    public int getVolume(){return this.volume;}

    public void radioInfo() {
        System.out.println("Radio brand is: " + brand);
        System.out.println("Radio cost is: " + cost);
        System.out.println("Radio volume is: " + volume);
    }
}
