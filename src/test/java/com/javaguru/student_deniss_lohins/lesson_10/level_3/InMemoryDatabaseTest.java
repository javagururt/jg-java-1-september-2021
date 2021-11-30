package com.javaguru.student_deniss_lohins.lesson_10.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void saveAndFindByTitle() {
        InMemoryDatabase victim = new InMemoryDatabase();
        String testTitle = "Test Product";
        Product product = new Product(testTitle);
        Product product1 = new Product("test2");
        Product product2 = new Product("test3");
        victim.save(product);
        victim.save(product1);
        victim.save(product2);
        assertEquals(product, victim.findByTitle(testTitle));
        assertEquals(product2, victim.findByTitle("test3"));
    }


}