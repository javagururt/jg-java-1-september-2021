package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity() != null) {
            if (t.getTrader().getCity().equalsIgnoreCase("Сидней")) {
                return true;
            }
        }
        return false;
    }
}
