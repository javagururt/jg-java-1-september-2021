package com.javaguru.student_ruslan_pankratov.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_16
@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
