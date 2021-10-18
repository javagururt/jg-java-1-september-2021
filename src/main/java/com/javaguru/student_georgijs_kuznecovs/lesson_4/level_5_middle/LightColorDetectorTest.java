package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_5_middle;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest();
        lightColorDetectorTest.detectTest2();
        lightColorDetectorTest.detectTest3();
        lightColorDetectorTest.detectTest4();
        lightColorDetectorTest.detectTest5();
        lightColorDetectorTest.detectTest6();
        lightColorDetectorTest.detectTest7();
    }
    public void detectTest() {
        int wavelength = 390;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Violet"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest2() {
        int wavelength = 451;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest3() {
        int wavelength = 500;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest4() {
        int wavelength = 581;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest5() {
        int wavelength = 600;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest6() {
        int wavelength = 700;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest7() {
        int wavelength = 1000;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }





}
