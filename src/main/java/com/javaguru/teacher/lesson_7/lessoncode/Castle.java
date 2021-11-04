package com.javaguru.teacher.lesson_7.lessoncode;

import java.util.Random;

class Castle {

    Horse getHorse(String color) {
        Horse horse = new Horse(color);
        return horse;
    }

    Horse getRandomHorse() {
        Random random = new Random();
        int number = random.nextInt(3);

//        if (number == 0) {
//            return new Horse("White");
//        }
//
//        if (number == 1) {
//            return new Horse("Black");
//        }
//
//        return new Horse("Brown");

        Horse horse;
        if (number == 0) {
            horse = new Horse("White");
        } else if (number == 1) {
            horse = new Horse("Black");
        } else {
            horse = new Horse("Brown");
        }
        return horse;
    }
}
