package com.javaguru.student_ruslan_pankratov.lesson_10.level_3;


import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ProductDatabaseTest {

    @Test
    public void saveTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Banana");
        Product product1 = new Product("Melon");
        Product product2 = new Product("Lemon");
        Product product3 = new Product("Eggs");

        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        int result = inMemoryDatabase.product.length;
        int expectedResult = 4;

        assertEquals(expectedResult, result);

    }

    @Test
    public void findByTitleTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Banana");
        Product product1 = new Product("Melon");
        Product product2 = new Product("Lemon");
        Product product3 = new Product("Eggs");

        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Optional<Product> result = inMemoryDatabase.findByTitle("banana");
       Optional<Product> expectedResult = Optional.of(product);

        assertEquals(expectedResult.toString(), result.toString());
    }
}