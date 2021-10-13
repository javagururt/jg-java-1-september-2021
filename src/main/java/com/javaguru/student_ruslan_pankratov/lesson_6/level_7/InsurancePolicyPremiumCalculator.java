package com.javaguru.student_ruslan_pankratov.lesson_6.level_7;

//Super_task_1
class InsurancePolicyPremiumCalculator {
    public static void main(String[] args) {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        Policy policy = new Policy();
        policy.insuranceSubObjectsTheft(7000);
        policy.insuranceSubObjectsFire(1999);
        double sum = insurancePolicyPremiumCalculator.calculate(policy);
        System.out.println("Full price = " + sum + " EUR");
    }

    double calculate(Policy policy) {
        double fullPrice = policy.getCostInsurance();
        return fullPrice;
    }
}
