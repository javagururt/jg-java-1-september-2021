package com.javaguru.student_deniss_lohins.lesson_6.level_7;

import java.util.Scanner;

class Policy {

    private String name;
    private int policyNumber;
    private int appartmentCount = 0;
    private double price;
    private boolean subObjects;

    public void addApartment(){
        boolean wantFireRisk = false;
        boolean wantTheftRisk = false;
        double subObjectValue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter apartment name: ");
        String name = sc.nextLine();
        System.out.print(" Please enter appartment value: ");
        double value = sc.nextDouble();
        System.out.print("Would you want to insure any sub objects? ");
        boolean wantInsureSubObjects = sc.hasNextBoolean();
        if(wantInsureSubObjects){
            System.out.print("Please enter sub object value: ");
            subObjectValue = sc.nextDouble();
            System.out.print("Would you want to insure fire risk?");
            wantFireRisk = sc.hasNextBoolean();
            System.out.print("Would you want to insure theft risk?");
            wantTheftRisk = sc.hasNextBoolean();
        }
        Appartments apartment = new Appartments(name, value, wantInsureSubObjects, subObjectValue, wantFireRisk, wantTheftRisk);

    }

    public void removeAppartment(){

    }

    public void addSubObjects(){

    }
    public void removeSubObjects(){

    }
    public void changeCoverage(boolean fire, boolean theft){
        if(fire){

        }
    }
}
