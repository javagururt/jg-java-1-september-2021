package com.javaguru.student_ruslan_pankratov.lesson_10.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
class InMemoryDatabase implements ProductDatabase {
    Product[] product = new Product[0];

    @Override
    public void save(Product product) {
        Product[] products = new Product[this.product.length + 1];
        for (int i = 0; i < products.length - 1; i++) {
            products[i] = this.product[i];
        }
        products[products.length - 1] = product;
        this.product = new Product[products.length];

        for (int i = 0; i < this.product.length; i++) {
            this.product[i] = products[i];
        }
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
        for (int i = 0; i < product.length; i++) {
            if(product[i].getTitle().equalsIgnoreCase(productTitle)){
                return Optional.of(product[i]);
            }
        }
        return Optional.empty();
    }
}
