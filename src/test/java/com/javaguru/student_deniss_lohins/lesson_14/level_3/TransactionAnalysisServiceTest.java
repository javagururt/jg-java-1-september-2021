package com.javaguru.student_deniss_lohins.lesson_14.level_3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {


    @Test
    public void findByYear2011(){
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2011);
        assertEquals(2, result.size());
    }
@Test
    public void findByYear2012(){
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2012);
        assertEquals(4, result.size());
    }
@Test
    public void findByYear2000(){
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> result = victim.findByYTear(new TransactionTestData().getTransactions(), 2000);
        assertEquals(0, result.size());
    }
}