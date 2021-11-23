package com.javaguru.student_ruslan_pankratov.lesson_9.level_4;

class FraudDetector {
    boolean isFraud(Transaction t) {

        if (t.getAmount() != 0) {
            if (t.getAmount() >= 1_000_000) {
                return true;
            }

            if(t.getTrader().getCountry() != null){
                if(t.getTrader().getCountry().equalsIgnoreCase("Германия") && t.getAmount() >= 1000){
                    return true;
                }
            }
        }
        if (t.getTrader().getCity() != null) {
            if (t.getTrader().getCity().equalsIgnoreCase("Сидней")) {
                return true;
            }
        }
        if (t.getTrader().getFullName() != null) {
            if (t.getTrader().getFullName().equalsIgnoreCase("Pokemon")) {
                return true;
            }
        }

        if (t.getTrader().getCountry() != null) {
            if (t.getTrader().getCountry().equalsIgnoreCase("Ямайка")) {
                return true;
            }
        }

        return false;
    }


}
