package com.javaguru.student_nikita_simans.homework.lesson_8.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        Porsche911 car = new Porsche911(2012, 290);

    }

}
