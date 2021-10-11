package com.javaguru.student_dmitrii_faierberg.lesson_3.level_5;

class Dog {
    private String name;
    private int age;
    private String color;
    Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println(name + " " + age + " " + color);
    }

    public void happyBirthday() {
        age += 1;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

}
