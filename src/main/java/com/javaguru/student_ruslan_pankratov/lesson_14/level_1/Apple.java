package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

import java.util.Objects;

class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return getWeight() == apple.getWeight() && Objects.equals(getColor(), apple.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getWeight());
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
