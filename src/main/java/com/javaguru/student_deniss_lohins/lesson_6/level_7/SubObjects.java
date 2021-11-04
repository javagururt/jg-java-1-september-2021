package com.javaguru.student_deniss_lohins.lesson_6.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SubObjects {

    private double price = 0;
    private double value = 0;
    private boolean fire;
    private boolean theft;

    public double calculatePrice() {

        if (fire) {
            price = price + theftCase(value);
        }
        if (theft) {
            price = price + fireCase(value);
        }
        return price;
    }



    public SubObjects(double value, boolean fire, boolean theft) {
        this.value = value;
        this.fire = fire;
        this.theft = theft;
            }

    double theftCase(double value){
        double price;
        if(value > 2000){
            price = value * 0.02;
        }else{
            price = value * 0.01;
        }
        return price;
    }

    double fireCase(double value){
        double price;
        if(value > 2000){
            price = value * 0.04;
        }else{
            price = value * 0.03;
        }
        return price;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public boolean isTheft() {
        return theft;
    }

    public void setTheft(boolean theft) {
        this.theft = theft;
    }
}
