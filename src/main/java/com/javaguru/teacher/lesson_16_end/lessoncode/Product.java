package com.javaguru.teacher.lesson_16_end.lessoncode;

import java.math.BigDecimal;

class Product {

    private final String name;
    private final BigDecimal price;
    private final String color;

    public Product(String name, BigDecimal price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
