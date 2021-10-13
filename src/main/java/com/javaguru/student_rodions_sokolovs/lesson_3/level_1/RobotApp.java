//Создайте отдельный класс RobotDemo для демонстрации
//        работы с классом Robot.
//
//        Внутри класса RobotDemo создайте метод
//
//public static void main(String[] args) {
//        // создайте экземпляр класса Robot вызвав конструктор класса
//        // сохраните ссылку (указатель) на только, что созданный
//        // виртуальный обьект класса Robot в переменную,
//        // она нам понадобиться для дальнейшего использования.
//        }
//В методе main(...) класса RobotDemo вызовите
//        метод sayHello() у созданного ранее виртуального обьекта.
//        Запустите вашу программу и убедитесь, что созданный вами
//        виртуальный обьект робот напечатал на консоли слово "Hello!".
//Создаём свою армию роботов!
//
//        В этом задании мы продолжаем работать с классом Robot.
//
//        В методе main(...) класса RobotDemo продемонстрируйте создание
//        нескольких виртуальный обьектов робот и работу с ними
//        (вызовы у них методов sayHello() и sayYourName()).
//
//        PS: ваш код внутри main метода будет выглядеть примерно так:
//
//        Robot robot1 = new Robot();
//        robot1.sayHello();
//        robot1.sayYourName();
//
//        Robot robot2 = new Robot();
//        robot2.sayHello();
//        robot2.sayYourName();
//
//        Класс (Robot) это как чертёж или шаблон, на основе которого
//        в вашей программе можно создавать сколько угодно виртуальных
//        обьектов и управлять ими (вызывать у них разные методы).

package com.javaguru.student_rodions_sokolovs.lesson_3.level_1;

public class RobotApp {

    public static void main(String[] args) {
        Robot robot = new Robot("R2D2");
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot("R23D12");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("R5612D1");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
