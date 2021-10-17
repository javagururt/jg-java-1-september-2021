package com.javaguru.student_deniss_lohins.lesson_4.level_5;

/*
380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")
 */
class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.redColorTest();
        testRunner.orangeColorTest();
        testRunner.yellowColorTest();
        testRunner.greenColorTest();
        testRunner.blueColorTest();
        testRunner.violetColorTest();
        testRunner.invisibleMinusColorTest();
        testRunner.invisiblePlusColorTest();
    }

    public void violetColorTest(){
        int min = 380;
        int max = 449;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Violet"){
            System.out.println("Violet test = OK");
        }else{
            System.err.println("Violet test = FAIL");
        }
    }

    public void blueColorTest(){
        int min = 450;
        int max = 494;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Blue"){
            System.out.println("Blue test = OK");
        }else{
            System.err.println("Blue test = FAIL");
        }
    }

    public void greenColorTest(){
        int min = 495;
        int max = 569;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Green"){
            System.out.println("Green test = OK");
        }else{
            System.err.println("Green test = FAIL");
        }
    }

    public void yellowColorTest(){
        int min = 570;
        int max = 589;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Yellow"){
            System.out.println("Yellow test = OK");
        }else{
            System.err.println("Yellow test = FAIL");
        }
    }

    public void orangeColorTest(){
        int min = 590;
        int max = 619;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Orange"){
            System.out.println("Orange test = OK");
        }else{
            System.err.println("Orange test = FAIL");
        }
    }

    public void redColorTest(){
        int min = 620;
        int max = 750;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Red"){
            System.out.println("Red test = OK");
        }else{
            System.err.println("Red test = FAIL");
        }
    }

    public void invisibleMinusColorTest(){
        int min = 0;
        int max = 379;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Invisible light"){
            System.out.println("Invisible light minus test = OK");
        }else{
            System.err.println("Invisible light minus test = FAIL");
        }
    }


    public void invisiblePlusColorTest(){
        int min = 750;
        int max = 2147483647;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        LighColorDetector victim = new LighColorDetector();
        String testResult = victim.detect(randomInt);
        if(testResult == "Invisible light"){
            System.out.println("Invisible light pluss test = OK");
        }else{
            System.err.println("Invisible light pluss test = FAIL");
        }
    }
}
