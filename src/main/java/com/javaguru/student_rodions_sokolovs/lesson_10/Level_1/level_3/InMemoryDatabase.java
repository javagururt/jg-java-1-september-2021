package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_3;


public class InMemoryDatabase implements ProductDatabasee {
        public Product[] product = new Product[0];


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

    public Product findByTitle(String productTitle) {
        for (int i = 0; i < product.length; i++) {
            if (product[i].getTitle().equalsIgnoreCase(productTitle)) {
                return product[i];
            }
        }
        return null;
    }
    }

