package com.javaguru.student_jekaterina_ola.lesson_3.level_3.task_11;


/*Добавьте в класс Robot свойство name:

class Robot {

    // в этом свойстве наш виртуальный обьект робот будет
    // запоминать своё имя. Мы используем тип String потому
    // что имя это строка.
    private String name;}

 */

public class RobotOne {
    String name;

    RobotOne(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Say Hello");
    }
    public void sayYourName() { System.out.println("My name is " + name);}
    }