package com.javaguru.student_ruslan_pankratov.lesson_6.level_7;

class Policy {

    public int getCostInsurance() {
        return costInsurance;
    }

    private int costInsurance = 0;

    void insuranceSubObjectsFire(double costInsurancePrice) {

        if (costInsurance >= 2000) {
            costInsurancePrice = costInsurancePrice * 0.04;
            costInsurance += costInsurancePrice;
        } else {
            costInsurancePrice = costInsurancePrice * 0.03;
            costInsurance += costInsurancePrice;
        }

    }


    void insuranceSubObjectsTheft(double costInsurancePrice) {

        if (costInsurance >= 2000) {
            costInsurancePrice = costInsurancePrice * 0.02;
            costInsurance += costInsurancePrice;
        } else {
            costInsurancePrice = costInsurancePrice * 0.01;
            costInsurance += costInsurancePrice;
        }
    }

}
