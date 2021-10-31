package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "нет необходимости возвращать что-то из метода updatePrice")
class Stock {
    String ticker;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String ticker, int price){
        this.ticker = ticker;
        this.currentPrice = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    public void getPriceInformation(){
        System.out.println("Company name: " +ticker+ " Current price: " +currentPrice+ ".");
        System.out.println("Max Price: " +maxPrice+ " Min Price: " +minPrice);
    }
    public int updatePrice(String ticker, int price){
        currentPrice = price;

        if (price > currentPrice){
            return maxPrice = price;
        } else if (price < currentPrice){
            return minPrice = price;
        }else {
            return currentPrice;
        }

    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        if (currentPrice > minPrice){
            return minPrice;
        }
        else {
            return currentPrice;
        }
    }

    public int getMaxPrice() {
        if (currentPrice < maxPrice){
            return maxPrice;
        }
        else {
            return currentPrice;
        }
    }
}
