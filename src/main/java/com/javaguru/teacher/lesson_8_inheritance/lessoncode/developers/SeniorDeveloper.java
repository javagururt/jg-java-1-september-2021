package com.javaguru.teacher.lesson_8_inheritance.lessoncode.developers;

class SeniorDeveloper extends MiddleDeveloper {

    @Override
    void code() {
        System.out.println("Fast coding");
    }

    void solveProblem() {
        System.out.println("Solving...");
    }

    @Override
    void learn() {
        System.out.println("Fast learner");
    }
}
