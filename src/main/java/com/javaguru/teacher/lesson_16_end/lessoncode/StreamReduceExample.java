package com.javaguru.teacher.lesson_16_end.lessoncode;

import java.math.BigDecimal;
import java.util.List;

class StreamReduceExample {

    public static void main(String[] args) {
        var product1 = new Product("Apple", new BigDecimal("100"), "Red");
        var product2 = new Product("Banana", new BigDecimal("-1"), "Yellow");
        var product3 = new Product("Potato", new BigDecimal("0"), null);
        var product4 = new Product("Tomato", new BigDecimal("30.1"), "Red");

        var products = List.of(
                product1,
                product2,
                product3,
                product4
        );

        var pricePredicate = new PricePredicate();

        var colorPredicate = new RedProductPredicate();

        var priceSum = products.stream()
                .filter(colorPredicate)
                .map(p -> p.getPrice())
                .reduce(BigDecimal.ZERO, (firstPrice, nextPrice) -> firstPrice.add(nextPrice));

        System.out.println(priceSum);
    }
}
