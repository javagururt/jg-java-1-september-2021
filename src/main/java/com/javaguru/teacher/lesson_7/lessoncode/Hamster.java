package com.javaguru.teacher.lesson_7.lessoncode;

class Hamster {

    int energy;
    int hungryLevel;

    //Default constructor
    public Hamster() {
    }

    private void run() throws Exception {
        while (energy > 0) {
            Thread.sleep(300);
            System.out.println("Run...");
            energy -= 10;
//        energy = energy - 10;
            hungryLevel -= 5;
        }
    }

    private void eat() throws InterruptedException {
        while (hungryLevel < 100) {
            Thread.sleep(300);
            System.out.println("om-nom-nom-njam-njam");
            hungryLevel += 10;
        }
    }

    private void sleep() throws InterruptedException {
        while (energy <= 30) {
            Thread.sleep(300);
            System.out.println("ZzzZ-zz-Zz");
            energy++;
            hungryLevel--;
        }
    }

    void instinct() throws Exception {
        if (hungryLevel <= 0) {
            eat();
        }
        if (energy <= 0) {
            sleep();
        }
        if (energy > 20) {
            run();
        }
    }
}
