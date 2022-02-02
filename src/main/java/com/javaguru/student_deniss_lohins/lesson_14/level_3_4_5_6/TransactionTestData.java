package com.javaguru.student_deniss_lohins.lesson_14.level_3_4_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.List;
@CodeReview(approved = true)
class TransactionTestData {
    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }
}
