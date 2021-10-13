//Тема: создание класса Dog.
//
//        Создать класс собака (Dog)
//        и продемонстрировать его работу с ним в программе.
//
//        Бизнес требования:
//        - У собаки должна быть кличка.
//        - Кличку собаке дают в момент создания и потом ее изменить нельзя.
//        - Собака должна уметь выполнять команду голос (voice()),
//        при выполнении этой команды на консоль должно выводиться
//        кличка собаки три раза.
//
//        Создать отдельный класс DogDemo,
//        объявить в нём main() метод и продемонстрировать
//        использование класса собака (Dog).
//Тема: создание класса Dog. Продолжение.
//
//        Создать класс собака (Dog)
//        и продемонстрировать его работу с ним в программе.
//
//        Бизнес требования:
//        - Сделайте возможность указывать цвет собаки.
//        - Пусть цвет задаётся просто строкой: "Red", "Black", etc.
//        - Собака должна уметь выполнять команду голос (voice()),
//        при выполнении этой команды на консоль должно выводиться
//        кличка собаки, ее возраст и цвет.
//
//        PS: добавьте свойство color в класс Dog,
//        добавьте в конструктор класса новое свойство и сохраните его,
//        дополните метод voice() выводом цвета на консоль.
//
//        Создать отдельный класс DogDemo,
//        объявить в нём main() метод и продемонстрировать
//        использование класса собака (Dog).

//Тема: создание класса Dog. Продолжение.
//
//        Создать класс собака (Dog)
//        и продемонстрировать его работу с ним в программе.
//
//        Бизнес требования:
//        - Должна быть возможность менять цвет собаки на другой.
//
//        PS: создайте в классе Dog метод:
//
//public void changeColor(String newColor) {
//        // напишите тут команду сохранения нового цвета в свойство класса
//        }
//
//        Создать отдельный класс DogDemo,
//        объявить в нём main() метод и продемонстрировать
//        использование класса собака (Dog).
//
//        Создайте собаку,
//        заставьте её подать голос,
//        заставьте её поменять цвет,
//        заставьте её подать голос снова и убедитесь в том,
//        что собака изменила свой цвет.


package com.javaguru.student_rodions_sokolovs.lesson_3.Level_5;

//TASK 18-22
class Dog {
    private String name;
    private int age;
    private String color;


    public Dog(String dogname, int dogage, String dogcolor) {
        this.name = dogname;
        this.age = dogage;
        this.color = dogcolor;
    }

    public void voice() {
        System.out.println("Hello! " + name);
        System.out.println("Hello! " + name);
        System.out.println("Hello! " + name);
        System.out.println("Dog Age: " + age);
        System.out.println("Dog color: " + color);


    }

    public void happybirthday() {
        age++;
        System.out.println("Happy birthday! you are " + age + " years old");
    }

    public void changecolor(String newColor) {
        this.color = newColor;

    }

}



