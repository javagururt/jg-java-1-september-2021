package com.javaguru.teacher.lesson_16_end.lessoncode;

import java.math.BigDecimal;
import java.util.function.Predicate;

class PricePredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        int result = product.getPrice().compareTo(BigDecimal.ZERO);
        return result >= 1;
    }
}
