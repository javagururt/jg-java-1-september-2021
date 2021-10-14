package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

public class RodionDemo {
    public static void main(String[] args) {
        Rodion rodion = new Rodion("ничего не вышло", 77, "is activated");
        rodion.startday();
        rodion.fixing();
        rodion.chilling();
        rodion.NewFix("получилось");
        rodion.fixing();
    }
}
