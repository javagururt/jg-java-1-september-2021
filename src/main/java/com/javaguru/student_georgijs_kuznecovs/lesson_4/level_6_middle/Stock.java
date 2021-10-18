package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_6_middle;

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
        } else
        this.currentPrice = currentPrice;
    }

    String getPriceInformation(){
        String result = "Company = " + name + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
        return result;
    }
}
