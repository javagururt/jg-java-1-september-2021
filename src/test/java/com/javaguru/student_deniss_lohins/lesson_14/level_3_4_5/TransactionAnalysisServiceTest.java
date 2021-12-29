package com.javaguru.student_deniss_lohins.lesson_14.level_3_4_5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {


    @Test
    public void findByYear2011() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2011);
        assertEquals(2, result.size());
    }

    @Test
    public void findByYear2012() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2012);
        assertEquals(4, result.size());
    }

    @Test
    public void findByYear2000() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2000);
        assertEquals(0, result.size());
    }

    @Test
    public void sortIncreasingOrderByValue() {
        List<Transaction> result = new TransactionAnalysisService().increasingValueOrder(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void sortDecreasingorderByValue() {
        List<Transaction> result = new TransactionAnalysisService().decreasingValueOrder(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void sort2011YearIncreasing() {
        List<Transaction> result = new TransactionAnalysisService().transactions2011IncreasingOrder(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showYearsOfTransaction() {
        List<Integer> result = new TransactionAnalysisService().listOfTransactionYears(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueYearsOfTransaction() {
        List<Integer> result = new TransactionAnalysisService().listOfUniqueTransactionYears(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueYearsOfTransactionStream() {
        List<Integer> result = new TransactionAnalysisService().listOfUniqueTransactionYearsStream(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueTradersName() {
        List<String> result = new TransactionAnalysisService().listOfUniqueTradersNames(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueTradersNameStream() {
        List<String> result = new TransactionAnalysisService().listOfUniqueTradersNamesStream(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueTradersCity() {
        List<String> result = new TransactionAnalysisService().listOfUniqueTradersCity(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueTradersCityStream() {
        List<String> result = new TransactionAnalysisService().listOfUniqueTradersCityStream(new TransactionTestData().getTransactions());
        System.out.println(result);
    }


    @Test
    public void showTradersFromCambridge() {
        List<String> result = new TransactionAnalysisService().listOfTradersFromCambridge(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showTradersFromCambrdgeV2() {
        List<String> result = new TransactionAnalysisService().listOfTradersFromSpecificCity(new TransactionTestData().getTransactions(),
                "cambridge");
        System.out.println(result);
    }

    @Test
    public void showTradersFromCLondon() {
        List<String> result = new TransactionAnalysisService().listOfTradersFromSpecificCity(new TransactionTestData().getTransactions(),
                "london");
        System.out.println(result);
    }

    @Test
    public void showTradersFromMilan() {
        List<String> result = new TransactionAnalysisService().listOfTradersFromSpecificCity(new TransactionTestData().getTransactions(),
                "milan");
        System.out.println(result);
    }

    @Test
    public void isThereAnyTradersFromMilan() {
        boolean result = new TransactionAnalysisService().isAnyTradersFromMilan(new TransactionTestData().getTransactions());
        assertTrue(result);
    }

    @Test
    public void isThereAnyTradersFromMilanV2() {
        boolean result = new TransactionAnalysisService().isAnyTradersFromSpecificCity(new TransactionTestData().getTransactions(), "milan");
        assertTrue(result);
    }

    @Test
    public void isThereAnyTradersFromLondon() {
        boolean result = new TransactionAnalysisService().isAnyTradersFromSpecificCity(new TransactionTestData().getTransactions(), "london");
        assertFalse(result);
    }

    @Test
    public void isThereAnyTradersFromCambridge() {
        boolean result = new TransactionAnalysisService().isAnyTradersFromSpecificCity(new TransactionTestData().getTransactions(), "CambridGE");
        assertTrue(result);
    }

    @Test
    public void findHighestValue(){
        Optional<Transaction> interimResult = new TransactionAnalysisService().highestValue(new TransactionTestData().getTransactions());
        boolean result = interimResult.isPresent();
        System.out.println(interimResult);
        assertTrue(result);
    }

    @Test
    public void notFindHighestValue(){
        List<Transaction> emptyList = new ArrayList<>();
        boolean result = new TransactionAnalysisService().highestValue(emptyList).isPresent();
        assertFalse(result);
    }

    @Test
    public void findLowestValue(){
        Optional<Transaction> interimResult = new TransactionAnalysisService().lowestValue(new TransactionTestData().getTransactions());
        boolean result = interimResult.isPresent();
        System.out.println(interimResult);
        assertTrue(result);
    }

    @Test
    public void notFindLowestValue(){
        List<Transaction> emptyList = new ArrayList<>();
        boolean result = new TransactionAnalysisService().lowestValue(emptyList).isPresent();
        assertFalse(result);
    }

    @Test
    public void collectTradersNamesIncreasingOrder(){
        String result = new TransactionAnalysisService().tradersNamesIncreasingOrder(new TransactionTestData().getTransactions());
        System.out.println(result);
    }

    @Test
    public void collectTradersCityIncreasingOrder(){
        String result = new TransactionAnalysisService().tradersCityIncreasingOrder(new TransactionTestData().getTransactions());
        System.out.println(result);
    }
}