package com.javaguru.student_dmitrii_faierberg.lesson_8.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;
    PetrolCar(int tank) { petrolTankCapacity = tank; }
    @Override
    void accelerate() {
        System.out.println("vrum vruuuum");
        petrolTankCapacity--;
    }
}
