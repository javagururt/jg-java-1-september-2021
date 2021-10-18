package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

//TASK 24
class Rodion {
    private String fix;
    private int chill;

    public Rodion(String fix, int chill, String start) {
        this.fix = fix;
        this.chill = chill;
    }

    public void startday() {
        System.out.println("Sleep.");
        System.out.println("Sleep..");
        System.out.println("Sleep...");
        System.out.println("Rodion is activated");
    }

    public void fixing() {
        System.out.println("В попытке что-то починить у вас " + fix);
    }

    public void chilling() {
        System.out.println("Отдыхаю от очень важых дел +" + chill + "% к удаче");
    }

    public void NewFix(String newFix) {
        this.fix = newFix;

    }

}