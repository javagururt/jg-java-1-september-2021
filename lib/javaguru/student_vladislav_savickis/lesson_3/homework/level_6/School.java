package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class School {
    private String name;
    private int floors;
    private String address;

    School(String schoolName, int numberOfFloors, String schoolAddress) {
        this.name = schoolName;
        this.floors = numberOfFloors;
        this.address = schoolAddress;
    }

    public void schoolInfo() {
        System.out.println("School name: " + name);
        System.out.println("Number of floors: " + floors);
        System.out.println("School address: " + address);
    }
}
