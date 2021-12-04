package com.javaguru.student_dmitrii_faierberg.lesson_10.level_3;

import org.junit.Test;

import java.awt.color.ProfileDataException;
import java.util.Optional;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void saveProductTest(){
        InMemoryDatabase victim = new InMemoryDatabase();
        Product product = new Product("Something");
        victim.save(product);
        assertEquals(victim.products.length, 1);
    }

    @Test
    public void findTitleTest(){
        InMemoryDatabase victim = new InMemoryDatabase();
        Product product1 = new Product("1");
        Product product2 = new Product("2");
        Product product3 = new Product("3");

        victim.save(product1);
        victim.save(product2);
        victim.save(product3);

        Optional<Product> optional = victim.findByTitle("2");
        Product result;
        if (optional.isPresent()){
            result = optional.get();
            assertEquals(result.getTitle(), "2");
        } else {
            throw new AssertionError("Product is not found");
        }

        optional = victim.findByTitle("4");
        if (optional.isPresent()){
            throw new AssertionError("Not existing product was found");
        }
    }

}