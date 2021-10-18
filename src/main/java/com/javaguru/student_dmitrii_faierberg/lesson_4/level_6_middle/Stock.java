package com.javaguru.student_dmitrii_faierberg.lesson_4.level_6_middle;

/*
Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice()
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().
 */

class Stock {
    private String name;
    private int currentPrice;
    private int minPrice = 0;
    private int maxPrice = 0;

    Stock(String name, int currentPrice){
        this.name = name;
        this.updatePrice(currentPrice);
    }
    Stock() {}
    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        if (minPrice == 0 && maxPrice == 0){
            minPrice = currentPrice;
            maxPrice = currentPrice;
        }
        if (currentPrice > maxPrice) maxPrice = currentPrice;
        if (currentPrice < minPrice) minPrice = currentPrice;

    }

    public void getPriceInformation(){
        System.out.println("Company = " + name +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " +
                 maxPrice);

    }
    public int getMinPrice() { return minPrice; }
    public int getMaxPrice() { return maxPrice; }
    public int getCurrentPrice() { return  currentPrice;}
}
