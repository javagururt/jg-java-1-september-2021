package com.javaguru.student_deniss_lohins.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest testRunner = new LeapYearTest();
        testRunner.leapYearTest();
        testRunner.centuryLeapYearTest();
        testRunner.centuryYearTest();
        testRunner.ordinaryYearTest();
    }


    public void leapYearTest(){
        int min = 0;
        int max = 100;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInt = randomInt * 4;
        LeapYear victim = new LeapYear();
        boolean result = victim.isLeapYear(testInt);
        if(result){
            System.out.println("Leap Year test = OK");
        }else{
            System.err.println("Leap Year test = FAIL");
        }
    }

    public void centuryYearTest(){
        int min = 0;
        int max = 100;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInt = randomInt * 100 * 3;
        LeapYear victim = new LeapYear();
        boolean result = victim.isLeapYear(testInt);
        if(result != true){
            System.out.println("Century Year test = OK");
        }else{
            System.err.println("Century Year test = FAIL");
        }
    }


    public void centuryLeapYearTest(){
        int min = 0;
        int max = 100;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInt = randomInt * 100 * 4;
        LeapYear victim = new LeapYear();
        boolean result = victim.isLeapYear(testInt);
        if(result){
            System.out.println("Century Leap Year test = OK");
        }else{
            System.err.println("Century Leap Year test = FAIL");
        }
    }

    public void ordinaryYearTest(){
        /*int min = 0;
        int max = 100;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);*/
        int testInt = 1999;
      /*  if(randomInt % 4 == 0){
            testInt = randomInt + 1;
        }else{
            testInt = randomInt;
        }*/
        LeapYear victim = new LeapYear();
        boolean result = victim.isLeapYear(testInt);
        if(result != true){
            System.out.println("Ordinary Year test = OK");
        }else{
            System.err.println("Ordinary Year test = FAIL");
        }
    }
}
