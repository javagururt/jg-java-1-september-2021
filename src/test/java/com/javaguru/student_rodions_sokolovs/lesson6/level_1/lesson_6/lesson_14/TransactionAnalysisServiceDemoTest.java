package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_14;

import com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.level_3.Transaction;
import com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.level_3.TransactionAnalysisService;
import com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.level_3.TransactionTest;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceDemoTest {

    @Test
    public void findByYear2011() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findYears(new TransactionTest().getTransactions(), 2011);
        assertEquals(2, result.size());
    }

    @Test
    public void findByYear2012() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findYears(new TransactionTest().getTransactions(), 2012);
        assertEquals(4, result.size());
    }

    @Test
    public void findByYear2000() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findYears(new TransactionTest().getTransactions(), 2000);
        assertEquals(0, result.size());
    }

    @Test
    public void sortIncreasingOrderByValue() {
        List<Transaction> result = new TransactionAnalysisService().ValueOrder(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void sortDecreasingorderByValue() {
        List<Transaction> result = new TransactionAnalysisService().decreasingValueOrder(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void sort2011YearIncreasing() {
        List<Transaction> result = new TransactionAnalysisService().transactions2011(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showYearsOfTransaction() {
        List<Integer> result = new TransactionAnalysisService().TransactionYears(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueYearsOfTransaction() {
        List<Integer> result = new TransactionAnalysisService().UniqueYears(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showUniqueYearsOfTransactionStream() {
        List<Integer> result = new TransactionAnalysisService().UniqueTransactionYears(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showTradersFromCambridge() {
        List<String> result = new TransactionAnalysisService().listCambridge(new TransactionTest().getTransactions());
        System.out.println(result);
    }

    @Test
    public void showTradersFromCLondon() {
        List<String> result = new TransactionAnalysisService().findTraderNamesFromCity(new TransactionTest().getTransactions(),
                "london");
        System.out.println(result);
    }

    @Test
    public void showTradersFromMilan() {
        List<String> result = new TransactionAnalysisService().findTraderNamesFromCity(new TransactionTest().getTransactions(),
                "milan");
        System.out.println(result);
    }

}
