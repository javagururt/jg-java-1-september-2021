package com.javaguru.student_dmitrii_faierberg.lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year){
        return transactions.stream().filter(t -> t.getYear() == year).collect(Collectors.toList());
    }

    /*public List<Transaction> sortTransactionsByValue(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
    }*/

    public void sortTransactionsByValue(List<Transaction> transactions){
        transactions.sort(Comparator.comparingInt(Transaction::getValue));
    }

    public void sortTransactionsByValueReversed(List<Transaction> transactions){
        transactions.sort(Comparator.comparingInt(Transaction::getValue).reversed());
    }

    public List<Transaction> findSortedTransactionsByYear(List<Transaction> transactions, int year){
        List<Transaction> result = findTransactionsByYear(transactions, year);
        sortTransactionsByValue(result);
        return result;
    }

    public List<Integer> getAllYearsOfTransactions(List<Transaction> transactions){
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toList());
    }

    public List<Integer> getYearsOfTransactions(List<Transaction> transactions) {
        return transactions.stream().
                map(Transaction::getYear)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Trader> getTraders(List<Transaction> transactions){
        return transactions.stream().map(Transaction::getTrader).distinct().collect(Collectors.toList());
    }

    public List<String> getCities(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(cityToFind))
                .distinct()
                .collect(Collectors.toList());
        return traders.stream().map(Trader::getName).collect(Collectors.toList());
    }

    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public Optional<Integer> getMaxValue(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare);
    }

    public Optional<Integer> getMinValue(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare);
    }

    public String getTradersNames(List<Transaction> transactions){
        return transactions.stream()
                .map(t -> t.getTrader().getName())
                .sorted(Comparator.comparing(String::valueOf))
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String getCitiesNames(List<Transaction> transactions){
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .sorted(Comparator.comparing(String::valueOf))
                .distinct()
                .collect(Collectors.joining(","));
    }
}
