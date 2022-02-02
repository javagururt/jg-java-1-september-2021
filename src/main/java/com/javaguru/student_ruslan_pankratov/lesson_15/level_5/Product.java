package com.javaguru.student_ruslan_pankratov.lesson_15.level_5;

import java.util.Objects;

class Product {
    private double sellIn; // срок хранения всегда -1 только
    private double quality;// (качество) не больше 50-ти и каждый раз по разному
    private String name;
    private double qualityLossRatePercent;//коэфециент снижения качества
    private boolean durable;

    public double getQualityLossRatePercent() {
        return qualityLossRatePercent;
    }

    public boolean isDurable() {
        return durable;
    }

    public Product(double sellIn, double quality, String name) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.name = name;
    }

    public Product(String name, double qualityLossRatePercent, boolean durable) {
        this.name = name;
        this.qualityLossRatePercent = qualityLossRatePercent;
        this.durable = durable;
    }

    public double getSellIn() {
        return sellIn;
    }

    public void setSellIn(double sellIn) {
        this.sellIn = sellIn;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualityLossRatePercent(double qualityLossRatePercent) {
        this.qualityLossRatePercent = qualityLossRatePercent;
    }

    public void setDurable(boolean durable) {
        this.durable = durable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getSellIn(), getSellIn()) == 0 && Double.compare(product.getQuality(), getQuality()) == 0 && Double.compare(product.getQualityLossRatePercent(), getQualityLossRatePercent()) == 0 && isDurable() == product.isDurable() && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSellIn(), getQuality(), getName(), getQualityLossRatePercent(), isDurable());
    }

    @Override
    public String toString() {
        return "Product{" +
                "sellIn=" + sellIn +
                ", quality=" + quality +
                ", name='" + name + '\'' +
                ", qualityLossRatePercent=" + qualityLossRatePercent +
                ", durable=" + durable +
                '}';
    }
}
