package com.javaguru.student_deniss_lohins.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;

/*
войства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice()
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().
 */
@CodeReview(approved = true)
class Stock {
    private String name;
    private double price;
    private double minPrice;
    private double maxPrice;

    Stock(String name, double price){
        this.name = name;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    public void updatePrice(double price) {
        if (price > maxPrice){this.maxPrice = price;}
        if (price < minPrice){ this.minPrice = price;}
        this.price = price;
    }

    public String getPriceInformation() {
        String retunrInformation = "\"" + name + "\"" + ", Current price = " + price + " , Min price = " + minPrice + ", Max price = " + maxPrice;
        return retunrInformation;
    }

}
