package com.javaguru.teacher.lesson_15.lessoncode;

import org.junit.After;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class ProductRepositoryArrayListImplTest {

    private ProductRepositoryArrayListImpl victim;

    @After
    public void tearDown() {
        SequenceIdGenerator.reset();
    }

    @Test
    public void shouldSaveProduct() {
        List<Product> database = new ArrayList<>();
        victim = new ProductRepositoryArrayListImpl(database);

        Product product = new Product(null, "apple", new BigDecimal("150.00"));
        Product actual = victim.save(product);
        assertNotNull(actual);
        assertNotNull(actual.getId());
        Long expectedId = 0L;
        assertEquals(expectedId, actual.getId());
        assertEquals("apple", actual.getName());
        assertEquals(new BigDecimal("150.00"), actual.getPrice());

        Optional<Product> fromDb = victim.findById(0L);
        assertTrue(fromDb.isPresent());
    }

    @Test
    public void shouldFindById() {
        List<Product> database = new ArrayList<>();
        Product product = createProduct("apple", new BigDecimal("150.00"));
        database.add(product);

        victim = new ProductRepositoryArrayListImpl(database);

        Optional<Product> fromDb = victim.findById(0L);

        assertTrue(fromDb.isPresent());
        Product productFromDb = fromDb.get();
        assertNotSame(productFromDb, product);
        assertEquals("apple", productFromDb.getName());
        assertEquals(new BigDecimal("150.00"), productFromDb.getPrice());
    }

    @Test
    public void shouldReturnOptionalEmptyWhenNotFound() {
        List<Product> database = new ArrayList<>();
        database.add(createProduct("apple", new BigDecimal("150.00")));

        victim = new ProductRepositoryArrayListImpl(database);

        Optional<Product> fromDb = victim.findById(10L);
        assertFalse(fromDb.isPresent());
    }

    @Test
    public void shouldDeleteById() {
        List<Product> database = new ArrayList<>();
        database.add(createProduct("apple", new BigDecimal("150.00")));

        victim = new ProductRepositoryArrayListImpl(database);

        victim.deleteById(0L);
        Optional<Product> fromDb = victim.findById(0L);
        assertFalse(fromDb.isPresent());
    }

    @Test
    public void shouldReturnTrueIfExistsByName() {
        List<Product> database = new ArrayList<>();
        database.add(createProduct("apple", new BigDecimal("150.00")));

        victim = new ProductRepositoryArrayListImpl(database);

        boolean exists = victim.existsByName("apple");
        assertTrue(exists);
    }

    @Test
    public void shouldReturnFalseIfNotExistsByName() {
        List<Product> database = new ArrayList<>();
        database.add(createProduct("apple", new BigDecimal("150.00")));

        victim = new ProductRepositoryArrayListImpl(database);

        boolean exists = victim.existsByName("banana");
        assertFalse(exists);
    }

    @Test
    public void shouldUpdateProductIfFound() {
        List<Product> database = new ArrayList<>();
        database.add(createProduct("apple", new BigDecimal("150.00")));

        victim = new ProductRepositoryArrayListImpl(database);

        Product updatedProduct = new Product(0L, "Banana", new BigDecimal("100.00"));
        victim.update(updatedProduct);

        Optional<Product> fromDb = victim.findById(0L);
        assertTrue(fromDb.isPresent());
        Product productFromDb = fromDb.get();
        assertEquals("Banana", productFromDb.getName());
        assertEquals(new BigDecimal("100.00"), productFromDb.getPrice());
    }


    private Product createProduct(String name, BigDecimal price) {
        return new Product(SequenceIdGenerator.generateId(), name, price);
    }

}