package com.javaguru.teacher.lesson_7.lessoncode;

class HamsterWorld {

    void live(Hamster hamster) throws Exception {
        while (true) {
            Thread.sleep(1000);
            hamster.instinct();
        }
    }


}
