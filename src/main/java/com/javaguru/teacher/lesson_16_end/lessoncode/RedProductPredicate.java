package com.javaguru.teacher.lesson_16_end.lessoncode;

import java.util.function.Predicate;

class RedProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return "red".equalsIgnoreCase(product.getColor());
    }
}
