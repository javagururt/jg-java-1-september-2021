package com.javaguru.teacher.lesson_5.lessoncode;

class Stock {

    private double currentPrice;
    private double maxPrice;
    private double minPrice;

    public Stock(double price) {
        this.currentPrice = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    void update(double price) {
        currentPrice = price;

        if (price < minPrice) {
            minPrice = price;
        } else if (price > maxPrice) {
            maxPrice = price;
        }
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }
}
