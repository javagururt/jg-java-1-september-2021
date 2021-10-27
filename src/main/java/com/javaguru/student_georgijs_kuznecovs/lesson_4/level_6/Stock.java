package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "текущая цена не меняется после апдейта")
class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice){
         this.name = name;
         this.currentPrice = currentPrice;
         this.minPrice = currentPrice;
         this.maxPrice = currentPrice;
    }

    void updatePrice(int currentPrice){
        if (currentPrice < minPrice) {
            this.minPrice = currentPrice;
        }else if (currentPrice > maxPrice) {
            this.maxPrice = currentPrice;
        }
    }

    String getPriceInformation(){
        String result = "Company = " + name + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
        return result;
    }
}
