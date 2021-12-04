package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
class FraudDetector {

    Transaction transaction;

    public FraudDetector(Transaction transaction) {
        this.transaction = transaction;
    }

    FraudDetectionResult isFraud(List<FraudRule> fraudRule) {
        for (int i = 0; i < fraudRule.size(); i++) {
            if (fraudRule.get(i).isFraud(transaction)) {
                FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(true, fraudRule.get(i).getRuleName());
                System.out.println("Транзакция = " +transaction.toString());
                System.out.println("Трейдер = " + transaction.getTrader().toString());
                return fraudDetectionResult;
            }
        }
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(false,"Не одно из правил не сработало");
        return fraudDetectionResult;
    }
}
