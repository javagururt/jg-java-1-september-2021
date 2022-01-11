package com.javaguru.student_dmitrii_faierberg.lesson_14.level_3_4_5_6;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void findTransactionsIn2011Test(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();
        var result = service.findTransactionsByYear(transactions, 2011);

        List<Transaction> expected = new ArrayList<>();
        expected.add(transactions.get(0));
        expected.add(transactions.get(2));

        assertEquals(expected, result);
    }

    @Test
    public void findTransactionsIn2012Test(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();
        var result = service.findTransactionsByYear(transactions, 2012);

        List<Transaction> expected = new ArrayList<>();
        expected.add(transactions.get(1));
        expected.add(transactions.get(3));
        expected.add(transactions.get(4));
        expected.add(transactions.get(5));

        assertEquals(expected, result);
    }

    @Test
    public void shouldSortByValueTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();
        service.sortTransactionsByValue(transactions);

        for (int i = 1; i < transactions.size(); i++){
            if (transactions.get(i-1).getValue() > transactions.get(i).getValue())
                throw new AssertionError("The list is not sorted");
        }

    }

    @Test
    public void shouldSortByValueReversedTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();
        service.sortTransactionsByValueReversed(transactions);

        for (int i = 1; i < transactions.size(); i++){
            if (transactions.get(i-1).getValue() < transactions.get(i).getValue())
                throw new AssertionError("The list is not sorted");
        }

    }

    @Test
    public void findSortedTransactionsByYearTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Transaction> actual = service.findSortedTransactionsByYear(transactions, 2011);

        List<Transaction> expected = service.findTransactionsByYear(transactions, 2011);
        service.sortTransactionsByValue(expected);

        assertEquals(expected, actual);
    }

    @Test
    public void getAllYearsTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Integer> actual = service.getAllYearsOfTransactions(transactions);

        List<Integer> expected = new ArrayList<>();
        for (Transaction transaction : transactions) {
            expected.add(transaction.getYear());
        }

        assertEquals(expected, actual);
    }

    @Test
    public void getAllUniqueYearsTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Integer> actual = service.getYearsOfTransactions(transactions);

        Set<Integer> expectedSet = new HashSet<>();
        for (Transaction transaction : transactions) {
            expectedSet.add(transaction.getYear());
        }
        List<Integer> expected = expectedSet.stream().sorted().collect(Collectors.toList());

        assertEquals(expected, actual);
    }

    @Test
    public void getTradersTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Trader> actual = service.getTraders(transactions);

        Set<Trader> expectedSet = new HashSet<>();
        for (Transaction transaction : transactions){
            expectedSet.add(transaction.getTrader());
        }
        List<Trader> expected = expectedSet.stream().toList();
        assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getCitiesTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<String> actual = service.getCities(transactions);

        Set<String> expectedSet = new HashSet<>();
        for (Transaction transaction : transactions){
            expectedSet.add(transaction.getTrader().getCity());
        }
        List<String> expected = expectedSet.stream().toList();
        assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getTraderNamesFromCitiesTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<String> actual = service.getTraderNamesFromCity(transactions, "Milan");
        List<String> expected = new ArrayList<>();
        expected.add("Mario");
        assertEquals(expected, actual);
    }

    @Test
    public void isAnyTraderBasedOnCityTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        boolean cambridgeBased = service.isAnyTraderBasedOnCity(transactions, "Cambridge");
        boolean londonBased = service.isAnyTraderBasedOnCity(transactions, "London");
        boolean milanBased = service.isAnyTraderBasedOnCity(transactions, "Milan");

        assertTrue(cambridgeBased);
        assertFalse(londonBased);
        assertTrue(milanBased);
    }

    @Test
    public void getMaxValueTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        Optional<Integer> optional = service.getMaxValue(transactions);
        assertEquals(Optional.of(1000), optional);
    }

    @Test
    public void getMinValueTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        Optional<Integer> optional = service.getMinValue(transactions);
        assertEquals(Optional.of(300), optional);
    }

    @Test
    public void getTradersNamesTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        String actual = service.getTradersNames(transactions);
        String expected = "Alan,Brian,Mario,Raoul";
        assertEquals(expected, actual);
    }

    @Test
    public void getCitiesNamesTest(){
        TransactionTestData data = new TransactionTestData();
        var transactions = data.getTransactions();
        TransactionAnalysisService service = new TransactionAnalysisService();

        String actual = service.getCitiesNames(transactions);
        String expected = "Cambridge,Milan";
        assertEquals(expected, actual);
    }
}