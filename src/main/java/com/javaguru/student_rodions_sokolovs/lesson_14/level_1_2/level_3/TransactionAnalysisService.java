package com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.level_3;

import java.util.*;
import java.util.stream.Collectors;


public class TransactionAnalysisService {
    public List<Transaction> findYears(List<Transaction> transactionList, int year) {
        List<Transaction> results = transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
        return results;
    }

    public List<Transaction> ValueOrder(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return result;
    }

    public List<Transaction> decreasingValueOrder(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                        .reversed())
                .collect(Collectors.toList());
        return result;
    }

    public List<Transaction> transactions2011(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> TransactionYears(List<Transaction> transactionList) {
        List<Integer> result = transactionList.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> UniqueYears(List<Transaction> transactionList) {
        List<Integer> result = transactionList.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());

        return result;
    }
    public List<Integer> UniqueTransactionYears(List<Transaction> transactionList) {
        Set<Integer> interimResult = new HashSet();
        for (Transaction transaction : transactionList) {
            interimResult.add(transaction.getYear());
        }
        List<Integer> result = new ArrayList<Integer>(interimResult);

        return result;

    }
    public List<String> listCambridge(List<Transaction> transactionList) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
    public List<String> findTraderNamesFromCity(List<Transaction> transactionList, String city) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
}