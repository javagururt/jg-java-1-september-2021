package com.javaguru.student_deniss_lohins.lesson_14.level_3_4_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.*;
import java.util.stream.Collectors;
@CodeReview(approved = true)
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

    public List<Transaction> decreasingValueOrder(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                        .reversed())
                .collect(Collectors.toList());
        return result;
    }

    public List<Transaction> transactions2011IncreasingOrder(List<Transaction> transactionList) {
        List<Transaction> result = transactionList.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> listOfTransactionYears(List<Transaction> transactionList) {
        List<Integer> result = transactionList.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> listOfUniqueTransactionYearsStream(List<Transaction> transactionList) {
        List<Integer> result = transactionList.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());

        return result;
    }

    public List<Integer> listOfUniqueTransactionYears(List<Transaction> transactionList) {
        Set<Integer> interimResult = new HashSet();
        for (Transaction transaction : transactionList) {
            interimResult.add(transaction.getYear());
        }
        List<Integer> result = new ArrayList<Integer>(interimResult);

        return result;

    }

    public List<String> listOfUniqueTradersNamesStream(List<Transaction> transactionList) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }

    public List<String> listOfUniqueTradersNames(List<Transaction> transactionList) {
        Set<String> interimResult = new HashSet();
        for (Transaction transaction : transactionList) {
            interimResult.add(transaction.getTrader().getName());
        }
        List<String> result = new ArrayList<String>(interimResult);
        return result;
    }

    public List<String> listOfUniqueTradersCity(List<Transaction> transactionList) {
        Set<String> interimResult = new HashSet();
        for (Transaction transaction : transactionList) {
            interimResult.add(transaction.getTrader().getCity());
        }
        List<String> result = new ArrayList<String>(interimResult);
        return result;
    }

    public List<String> listOfUniqueTradersCityStream(List<Transaction> transactionList) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }

    public List<String> listOfTradersFromCambridge(List<Transaction> transactionList) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }

    public List<String> listOfTradersFromSpecificCity(List<Transaction> transactionList, String city) {
        List<String> result = transactionList.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
        return result;
    }

    public boolean isAnyTradersFromMilan(List<Transaction> transactionList) {
        return transactionList.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("milan"));
    }

    public boolean isAnyTradersFromSpecificCity(List<Transaction> transactionList, String cityTocheck) {
        return transactionList.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(cityTocheck));
    }

    public Optional<Transaction> highestValue(List<Transaction> transactionList){
        return transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                        .reversed())
                .findFirst();
    }

    public Optional<Transaction> lowestValue(List<Transaction> transactionList){
        return transactionList.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .findFirst();
    }

    public String tradersNamesIncreasingOrder(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public String tradersCityIncreasingOrder(List<Transaction> transactionList){
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));
    }
}