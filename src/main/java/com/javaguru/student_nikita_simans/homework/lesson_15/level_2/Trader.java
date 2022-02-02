package com.javaguru.student_nikita_simans.homework.lesson_15.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}
