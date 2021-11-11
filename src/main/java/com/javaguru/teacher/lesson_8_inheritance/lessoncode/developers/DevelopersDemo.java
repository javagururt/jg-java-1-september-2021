package com.javaguru.teacher.lesson_8_inheritance.lessoncode.developers;

class DevelopersDemo {

    public static void main(String[] args) {
        System.out.println("Student");
        Student student = new Student();
        student.learn();

        System.out.println();
        System.out.println("Junior");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.code();
        juniorDeveloper.learn();
        System.out.println();

        System.out.println("Middle");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.code();
        middleDeveloper.learn();
        middleDeveloper.debug();
        System.out.println();

        System.out.println("Senior");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.code();
        seniorDeveloper.solveProblem();
        seniorDeveloper.debug();
        seniorDeveloper.learn();
        System.out.println();

        System.out.println("Senior as student");
        Student student1 = new SeniorDeveloper();
        student1.learn();

        Student[] students = new Student[2];
        JuniorDeveloper jd = new JuniorDeveloper();
        SeniorDeveloper sd = new SeniorDeveloper();
        students[0] = jd;
        students[1] = sd;

        MiddleDeveloper[] middleDevelopers = new MiddleDeveloper[2];
        MiddleDeveloper md = new MiddleDeveloper();
        SeniorDeveloper sd2 = new SeniorDeveloper();
        middleDevelopers[0] = md;
        middleDevelopers[1] = sd2;
        for (int i = 0; i < middleDevelopers.length; i++) {
            middleDevelopers[i].debug();
        }
    }
}
