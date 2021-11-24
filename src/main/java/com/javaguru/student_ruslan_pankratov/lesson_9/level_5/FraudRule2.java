package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {

        if (t.getAmount() != 0) {
            if (t.getAmount() >= 1_000_000) {
                return true;
            }
        }
        return false;
    }
}
