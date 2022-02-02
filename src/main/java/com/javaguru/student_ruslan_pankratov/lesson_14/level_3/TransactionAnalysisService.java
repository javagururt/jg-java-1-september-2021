package com.javaguru.student_ruslan_pankratov.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {
    public static void main(String[] args) {
    }
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sortingByValueStartingWithSmaller (List<Transaction> transactions){
         return transactions.stream()
                 .sorted(Comparator.comparing(transaction -> transaction.getValue()))
                 .collect(Collectors.toList());
    }

    public List<Transaction> sortingByValueStartingWithMore (List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())//reversed сделает наоборот проверку
                .collect(Collectors.toList());

    }


    public List<Transaction> sortingByValueStartingWithSmaller2011 (List<Transaction> transactions) {
          return transactions.stream()
          .filter(transaction -> transaction.getYear() == 2011)
          .sorted(Comparator.comparing(Transaction::getValue))
          .collect(Collectors.toList());
    }


    public List<Transaction> searchByTransactionYear(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public Set<Integer> uniqueYearOfTransaction(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> uniqueNameOfTransaction(List<Transaction> transactions) {
    return transactions.stream()
            .map(transaction -> transaction.getTrader().getName())
            .collect(Collectors.toSet());

    }

    public Set<String> searchUniqueForCitiesOfTraders(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public List<String> namesFromTheCityOfCambridge(List<Transaction> transactions){
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(transaction -> transaction.getTrader().getName())//как только мы узнали всех трйдеров из города
                //мы добавляем их имена в мапу и выводим в ту лист
                .sorted()
                .collect(Collectors.toList());
    }


    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(cityToFind))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
        //anyMatch может использовать бульевое выражение, и если есть хоть одно совпадение он выдаст тру
        //.allMatch() говорит о том, что всё должно быть тру, чтобы вышло тру
    }

    public Optional<Integer> highestValue(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .max(Comparator.comparing(Integer::valueOf));// этот метод позволяет определить самое большое число в
                //value он же его и возвращает. компаратор преобразуют видно в нужный тип данных, преобразовывая его
        //в данном случае у нас оптионал интежер, по этому его и надо превращать через valueOf
    }


    public Optional<Integer> minValue(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .min(Comparator.comparing(Integer::valueOf));//
    }


    public String alphabetOfNames(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));//объеденит стринг с разделителем ","

    }

    public

    String

    cityNames

            (List<Transaction>

                     transactions){

    return
            transactions.
 stream()
            .map(transaction ->
                                              transaction.getTrader()

  .getCity())
                                           .sorted()
            .distinct()
.collect(Collectors.joining(","));
    }


    // для обычного интежера надо использовать метод гет
//    public Integer minValue(List<Transaction> transactions){
//        return transactions.stream()
//                .map(transaction -> transaction.getValue())
//                .min(Comparator.comparing(Integer::valueOf)).get();//
//    }
    //вернуть город

}


