package com.javaguru.student_nikita_simans.homework.lesson_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

/*Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость
Методы:
- Обновить текущую стоимость акции updatePrice()
- Получить информацию об акции getPriceInformation()
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10*/
@CodeReview(approved = true)
public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }
    public String getPriceInformation() {
        return "Company = " + companyName + ", " + "Current Price = " + currentPrice + ", " + "Min Price = "
                + minPrice + ", " + "Max Price = " + maxPrice;
    }
    public void updatePrice(int newPrice){
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        currentPrice = newPrice;
    }


}
