package com.javaguru.student_mihails_mihejevs.lesson_3.level_1;
/*
Создайте класс робот (Robot).
Научите вашего робота "говорить" привет. Создайте в классе Robot метод со следующей сигнатурой:
public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
        }
 */
public class Robot {


 //DENISS
     public Robot() {
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }
 /* JEGOR
     String name;
    public Robot() {
    }

    public Robot(String robotName) {
        name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!"); // тут напишите команду распечатки на консоли строки "Hello!"
    }

    public void sayYourName() {
        System.out.println("My name is " +name); // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }
  */
}
