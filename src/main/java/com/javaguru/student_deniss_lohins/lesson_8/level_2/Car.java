package com.javaguru.student_deniss_lohins.lesson_8.level_2;

class Car {
    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}

class Porsche911Demo {

    public static void main(String[] args) {
        Porsche911 car = new Porsche911(2021, 350);

    }

}

