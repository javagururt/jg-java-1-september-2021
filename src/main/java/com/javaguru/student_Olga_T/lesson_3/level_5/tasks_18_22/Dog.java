package com.javaguru.student_Olga_T.lesson_3.level_5.tasks_18_22;

public class Dog {
    String dogsName;
    int dogsAge;
    String dogsColor;

    public Dog(String dogsName, int dogsAge, String dogsColor) {
        this.dogsName = dogsName;
        this.dogsAge = dogsAge;
        this.dogsColor = dogsColor;
    }

    public void happyBirthday() {
        this.dogsAge = this.dogsAge + 1;
    }

    public int getDogsAge() {
        return this.dogsAge;
    }

    public String getDogsName() {
        return this.dogsName;
    }

    public String getDogsColor() {
        return this.dogsColor;
    }

    public void changeColor(String newColor) {
        this.dogsColor = newColor;
    }

    void voice() {
        System.out.println(dogsName + ", " + dogsAge + " years! " + dogsName + ", " + dogsAge + " years! " + dogsName + ", " + dogsAge + " years!");
        System.out.println(dogsName + "!");
    }
}
