package com.javaguru.student_deniss_lohins.lesson_10.level_3;

class InMemoryDatabase implements ProductDatabase {

    Product[] memoryDatabase = {};

    @Override
    public void save(Product product) {
        Product[] temp = new Product[memoryDatabase.length + 1];
        for (int i = 0; i < memoryDatabase.length; i++) {
            temp[i] = this.memoryDatabase[i];
        }
        temp[temp.length - 1] = product;
        this.memoryDatabase = temp;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < memoryDatabase.length; i++) {
            if (memoryDatabase[i].getTitle().equalsIgnoreCase(productTitle)) {
                return memoryDatabase[i];
            }
        }
        return null;
    }

}
