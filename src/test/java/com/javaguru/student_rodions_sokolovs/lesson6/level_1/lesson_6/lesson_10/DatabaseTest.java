package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_10;

import com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3.InMemoryDatabase;
import com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    @Test
    public void Test() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Product1");
        Product product1 = new Product("Product2");
        Product product2 = new Product("Product3");

        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        int result = inMemoryDatabase.product.length;
        int expectedResult = 3;

        assertEquals(expectedResult, result);

    }


}
