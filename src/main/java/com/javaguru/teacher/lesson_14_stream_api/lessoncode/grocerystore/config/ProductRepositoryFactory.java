package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.config;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository.ProductRepository;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository.ProductRepositoryArrayListImpl;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository.ProductRepositoryHashMapImpl;

public class ProductRepositoryFactory {

    public ProductRepository getByName(String name) {
        if (name == null) {
            return new ProductRepositoryArrayListImpl();
        }
        if (name.equalsIgnoreCase("hashmap")) {
            return new ProductRepositoryHashMapImpl();
        }
        return new ProductRepositoryArrayListImpl();
    }
}
