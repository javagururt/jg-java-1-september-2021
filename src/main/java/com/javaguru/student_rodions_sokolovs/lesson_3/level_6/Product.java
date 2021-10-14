//Разработать класс - продукт,
//        у которого должны быть следующие характеристики:
//
//        Свойства:
//        - Наименование (String name)
//        - Стандартная цена (double regularPrice)
//        - Скидка в процентах (double discount)
//
//        Методы:
//        1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
//        Вывод информации о продукте в консоль (void printInformation())1P
//        2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
//
//        Класс с объявлением продукта должен называться "Product".
//        Класс с демонстрацией работы должен называться "ProductDemo".


package com.javaguru.student_rodions_sokolovs.lesson_3.level_6;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double Price() {
        double discountPrice = regularPrice / 100 * discount;
        double finalPrice = regularPrice - discountPrice;
        return finalPrice;
    }

    public void productinf() {
        System.out.println("Продукт: " + name);
        System.out.println("Цена без скидки " + regularPrice);
        System.out.println("Скидка " + discount);
        System.out.println("Цена со скидкой " + Price());

    }

}