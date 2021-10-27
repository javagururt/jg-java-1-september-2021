


//10 -> 12 -> 5 -> 7 -> 99 -> 77
package com.javaguru.student_rodions_sokolovs.lesson_4.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG",10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
