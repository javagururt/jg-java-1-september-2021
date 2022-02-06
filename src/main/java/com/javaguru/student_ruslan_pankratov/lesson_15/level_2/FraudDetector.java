package com.javaguru.student_ruslan_pankratov.lesson_15.level_2;


import com.javaguru.student_ruslan_pankratov.lesson_14.level_3.Trader;

class FraudDetector {

    boolean isFraud(Trader trader) {
        if (compareTraderName(trader) || (compareCity(trader))
        ) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareTraderName (Trader trader) {
        String traderName = trader.getName();
        if (traderName.equals("Pokemon")) {
        }
        return true;
    }

    boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }

}

