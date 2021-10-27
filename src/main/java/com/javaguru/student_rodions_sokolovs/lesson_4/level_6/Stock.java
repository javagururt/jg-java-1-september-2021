//Необходимо реализовать класс Stock ("акция") таким образом,
//        чтобы была возможность узнать текущую цену акции,
//        а также ее максимальную и минимальную стоимость
//        за период существования.
//
//        Класс Stock должен обладать следующими характеристиками:
//
//        Свойства:
//        - Имя компании
//        - Текущая стоимость
//        - Минимальная стоимость
//        - Максимальная стоимость
//
//        Методы:
//        - Обновить текущую стоимость акции updatePrice()
//        - Получить информацию об акции getPriceInformation()
//
//        Имя компании и начальную стоимость необходимо
//        задавать в момент создания акции.
//        Текущая, минимальная и максимальная стоимость
//        должны меняться только через метод updatePrice().
//
//        Написать тестовые сценарии для класса Stock в классе StockTest.
package com.javaguru.student_rodions_sokolovs.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Stock {
    private String name;
    private int price;
    private int minPrice;
    private int maxPrice;

    public Stock(String name,int price) {
        this.name = name;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }
    public void updatePrice(int newPrice) {
        price = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }

    }
    public String getPriceInformation(){
        String getPriceInformation = ("Company: " + name + " Current Price: " + price + " Min Price: " + minPrice + " Max Price: " + maxPrice);
        return getPriceInformation;
    }
}
