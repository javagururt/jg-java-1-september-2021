package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName() != null) {
            if (t.getTrader().getFullName().equalsIgnoreCase("Pokemon")) {
                return true;
            }
        }
        return false;
    }

}
