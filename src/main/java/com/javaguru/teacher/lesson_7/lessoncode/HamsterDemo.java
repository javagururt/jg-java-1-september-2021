package com.javaguru.teacher.lesson_7.lessoncode;

class HamsterDemo {

    public static void main(String[] args) throws Exception {
        HamsterWorld world = new HamsterWorld();
        Hamster firstHamster = new Hamster();

        world.live(firstHamster);
    }
}
