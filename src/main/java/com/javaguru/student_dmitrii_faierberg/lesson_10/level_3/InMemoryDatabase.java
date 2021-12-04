package com.javaguru.student_dmitrii_faierberg.lesson_10.level_3;

import java.io.PipedOutputStream;
import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    Product[] products;

    public void save(Product product){
        int newLength;

        if (products == null) {
            newLength = 1;
            Product[] newProducts = new Product[newLength];
            newProducts[newLength - 1] = product;
            products = newProducts;
        }
        else {
            newLength = products.length + 1;
            Product[] newProducts = Arrays.copyOf(products, newLength);
            newProducts[newLength - 1] = product;
            products = newProducts;
        }
    }
    public Optional<Product> findByTitle(String productTitle){
        for (Product item : products){
            if (item.getTitle().equals(productTitle)) return Optional.of(item);
        }
        return Optional.ofNullable(null);
    }


}
