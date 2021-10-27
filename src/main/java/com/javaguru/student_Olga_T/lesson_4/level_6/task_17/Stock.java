package com.javaguru.student_Olga_T.lesson_4.level_6.task_17;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Stock {
    String companyName;
    float actualStockPrice;
    float stockMinPrice;
    float stockMaxPrice;

    void updatePrice(float newStockPrice) {
        this.actualStockPrice = newStockPrice;
        if (newStockPrice > this.stockMaxPrice) {
            this.stockMaxPrice = newStockPrice;
        } else if (newStockPrice < this.stockMinPrice) {
            this.stockMinPrice = newStockPrice;
        }
    }

    Stock(String companyName, float actualStockPrice) {
        this.companyName = companyName;
        this.actualStockPrice = actualStockPrice;
        this.stockMaxPrice = actualStockPrice;
        this.stockMinPrice = actualStockPrice;
    }

    String getPriceInformation() {
        return "Company " + this.companyName + ", "
                + "Current Price = " + this.actualStockPrice + " ,"
                + " Min Price = " + this.stockMinPrice + ","
                + " Max Price = " + this.stockMaxPrice + ".";
    }

    public float getStockMaxPrice() {
        return this.stockMaxPrice;
    }

}



