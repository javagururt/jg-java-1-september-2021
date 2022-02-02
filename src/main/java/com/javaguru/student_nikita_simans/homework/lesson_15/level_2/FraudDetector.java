package com.javaguru.student_nikita_simans.homework.lesson_15.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {
    public boolean isFraud(Trader trader) {
        return traderNameAllowed(trader) || cityNameAllowed(trader);
    }

    private boolean traderNameAllowed(Trader trader) {
        String traderName = trader.getName();
        return traderName.equals("Pokemon");
    }

    private boolean cityNameAllowed(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}

