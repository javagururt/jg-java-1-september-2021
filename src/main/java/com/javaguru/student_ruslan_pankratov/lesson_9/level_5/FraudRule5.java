package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry() != null) {
            if (t.getTrader().getCountry().equalsIgnoreCase("Ямайка")) {
                return true;
            }
        }
        return false;
    }
}
