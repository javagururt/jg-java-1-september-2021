package com.javaguru.student_ruslan_pankratov.lesson_15.level_5;

import java.util.ArrayList;
import java.util.List;


class Shop {


    List<Product> allProducts = new ArrayList<>();

    List<Product> timeExpirationDate = new ArrayList<>();


    public Shop() {
        initialFilling();
    }

    void initialFilling() {
        Product product = new Product("banan", 200, false);
        Product product1 = new Product("apple", 200, false);
        Product product2 = new Product("telephone", 0, true);
        Product product3 = new Product("ter", 100, false);
        Product product4 = new Product("ger", 100, false);
        Product product5 = new Product("ner", 100, false);
        Product product6 = new Product("men", 45, false);
        Product product7 = new Product("Sulfuras", 0, true);
        Product product8 = new Product("Conjured", 200, false);

        timeExpirationDate.add(product);
        timeExpirationDate.add(product1);
        timeExpirationDate.add(product2);
        timeExpirationDate.add(product3);
        timeExpirationDate.add(product4);
        timeExpirationDate.add(product5);
        timeExpirationDate.add(product6);
        timeExpirationDate.add(product7);
        timeExpirationDate.add(product8);
    }


    void oneDayHasPassed() {

           allProducts.stream()
                   .filter(product1 ->
                           product1.getSellIn() > 10)
                   .filter(this::examination)
                   .forEach(this::moreThanTenDays);

           allProducts.stream()
                   .filter(product ->
                           product.getSellIn() <= 10
                                   && product.getSellIn() > 5)
                   .filter(product -> examination(product))
                   .forEach(product -> tenDaysLeft(product));

           allProducts.stream()
                   .filter(product ->
                           product.getSellIn() <= 5
                                   && product.getSellIn() > 0)
                   .filter(product ->
                           examination(product))
                   .forEach(product ->
                           fifeDaysLeft(product));
           allProducts.stream()
                   .filter(product ->
                           product.getSellIn() == 0
                                   && product.getQuality() > 0)
                   .filter(product ->
                           examination(product))
                   .forEach(product ->
                           goodsExpired(product));

           allProducts.stream()
                   .filter(product -> product.getSellIn() > 0)
                   .forEach(product ->
                           reductionOfShelfLife(product));




    }


    void print() {
        allProducts.stream()
                .filter(product -> product != null)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------" +
                "-----------------------------------------");
    }


    private void moreThanTenDays(Product product) {
      Product timeProduct =  timeExpirationDate.stream()
                .filter(product1 ->
                        product1.getName().equalsIgnoreCase(product.getName()))
                .findAny()
                .orElseThrow();

        double takesAway = timeProduct.getQualityLossRatePercent() / 100;
        product.setQuality(product.getQuality() - takesAway);
    }

    private void tenDaysLeft(Product product) {//2
        Product result = timeExpirationDate.stream()
                .filter(product1 -> product1.getName().equalsIgnoreCase(product.getName()))
                .findAny()
                .orElseThrow();
        double sum = result.getQualityLossRatePercent() / 100 * 2;
        product.setQuality(product.getQuality() - sum);
    }

    private void fifeDaysLeft(Product product) {//3
        Product result =  timeExpirationDate.stream()
                  .filter(product1 -> product1.getName().equalsIgnoreCase(product.getName()))
                  .findAny()
                  .orElseThrow();

        double sum = result.getQualityLossRatePercent() / 100 * 3;
        product.setQuality(product.getQuality() - sum);
    }

    private void goodsExpired(Product product) {
        //6
      Product result =  timeExpirationDate.stream()
                .filter(product1 -> product1.getName().equalsIgnoreCase(product.getName()))
                .findAny()
                .orElseThrow();
      double sum = result.getQualityLossRatePercent() / 100 * 6;
      product.setQuality(product.getQuality() - sum);
    }


    private void reductionOfShelfLife(Product product) {
        product.setSellIn(product.getSellIn() - 1);
    }

    private boolean examination(Product product) {//через бульево выражение мы можем сравнивать два разных списка
        return timeExpirationDate.stream()
                .filter(product1 ->
                        product1.getName().equalsIgnoreCase(product.getName()))
                .anyMatch(product1 -> !product1.isDurable());

    }

}
