package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 2876);
        stock.getPriceInformation();
        stock.updatePrice("GOOG", 2850);
        stock.getPriceInformation();
        stock.getMaxPrice();
        stock.getMinPrice();
        stock.updatePrice("GOOG", 2878);
        stock.getPriceInformation();
        stock.getMaxPrice();
        stock.getMinPrice();
    }
}
