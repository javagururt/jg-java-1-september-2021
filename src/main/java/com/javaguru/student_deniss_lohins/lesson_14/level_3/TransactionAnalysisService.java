package com.javaguru.student_deniss_lohins.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findByYTear(List<Transaction> transactionList, int year) {
        List<Transaction> results = transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
        return results;
    }

    public List<Transaction> increasingValueOrder(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return result;
    }

    public List <Transaction> decreasingValueOrder(List <Transaction> transactionList){
        List <Transaction> result = transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                .reversed())
                .collect(Collectors.toList());
        return result;
    }


}
