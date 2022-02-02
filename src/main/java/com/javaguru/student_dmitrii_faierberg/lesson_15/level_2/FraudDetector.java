package com.javaguru.student_dmitrii_faierberg.lesson_15.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {
    public boolean isFraud(Trader trader) {
        return compareTraderNameWithFraud(trader)
                || compareCityNameWithFraud(trader);
    }

    private boolean compareTraderNameWithFraud (Trader trader) {
        String traderName = trader.getName();
        return traderName.equals("Pokemon");
    }

    private boolean compareCityNameWithFraud(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}
