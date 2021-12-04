package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule3 extends FraudRule {


    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
           if(t.getAmount() >= 1000) {
               if (t.getTrader().getCountry() != null) {
                   if (t.getTrader().getCountry().equalsIgnoreCase("Германия") && t.getAmount() >= 1000) {
                       return true;
                   }
               }
           }
        return false;
    }
}
