package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_5_middle;



class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.invisibleLightTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();

    }
    public void invisibleLightTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(59);
        String expected = "Invisible light";
        if (result == expected){
            System.out.println("InvisibleLight test passed");
        }
        else {System.err.println("InvisibleLight test failed");}
    }

        public void violetTest(){
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(399);
            String expected = "Violet";
            if (result == expected){
                System.out.println("Violet test passed");
            }
            else {
                System.err.println("Violet test failed");
            }
        }
    public void blueTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(470);
        String expected = "Blue";
        if (result == expected){
            System.out.println("Blue test passed");
        }
        else {
            System.err.println("Blue test failed");
        }
    }
    public void greenTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(569);
        String expected = "Green";
        if (result == expected){
            System.out.println("Green test passed");
        }
        else {
            System.err.println("Green test failed");
        }
    }
    public void yellowTest(){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(570);
        String expected = "Yellow";
        if (result == expected){
            System.out.println("Yellow test passed");
        }
        else {
            System.err.println("Yellow test failed");
        }
    }
    public void orangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(619);
        String expected = "Orange";
        if (result == expected) {
            System.out.println("Orange test passed");
        } else {
            System.err.println("Orange test failed");
        }
    }
    public void redTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(750);
        String expected = "Red";
        if (result == expected) {
            System.out.println("Red test passed");
        } else {
            System.err.println("Red test failed");
        }
    }
    
}
