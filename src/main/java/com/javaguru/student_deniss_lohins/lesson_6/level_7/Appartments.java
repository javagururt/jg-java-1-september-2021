package com.javaguru.student_deniss_lohins.lesson_6.level_7;

class Appartments {

    private double value;
    private String name;
    private double price;

    public Appartments(String name, double value, boolean subObjects, double subObjectValue, boolean fire, boolean theft) {
       this.name = name;
       this.value = value;
       if(subObjects){
           SubObjects subObject1 = new SubObjects(subObjectValue, fire, theft);
           price = subObject1.calculatePrice() + price;
       }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
