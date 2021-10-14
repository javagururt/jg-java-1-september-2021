/*Создайте класс робот (Robot).
Научите вашего робота "говорить" привет. Создайте в классе Robot метод со следующей сигнатурой:
public void sayHello() {
// тут напишите команду распечатки на консоли строки "Hello!"
 }*/
//В классе робот (Robot) создайте конструктор без параметров:
//
//public Robot() {
//
//        }
//Научите вашего робота "говорить" как его зовут.
//
//        Создайте в классе Robot метод со следующей сигнатурой:
//
//public void sayYourName() {
//        // тут напишите команду распечатки на консоли строки "My name is ROBO"
//        }
//
//        В методе main(...) класса RobotDemo вызовите
//        метод sayYourName() у созданного ранее виртуального обьекта.
//        Запустите вашу программу и убедитесь, что созданный вами
//        виртуальный обьект робот напечатал на консоли "My name is ROBO".

package com.javaguru.student_rodions_sokolovs.lesson_3.level_1;

public class Robot {
    String rbname;

    public Robot(String robotname) {
        rbname = robotname;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {

        System.out.println("My name is " + rbname);
    }
}


