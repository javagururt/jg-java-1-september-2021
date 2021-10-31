package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest(390);
        lightColorDetectorTest.detectTest2(451);
        lightColorDetectorTest.detectTest3(500);
        lightColorDetectorTest.detectTest4(581);
        lightColorDetectorTest.detectTest5(600);
        lightColorDetectorTest.detectTest6(700);
        lightColorDetectorTest.detectTest7(1000);
    }
    public void detectTest(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Violet"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest2(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest3(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest4(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest5(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest6(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
    public void detectTest7(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light"){
            System.out.println("Light Color Detector Test = OK");
        }else
            System.out.println("Light Color Detector Test = FAIL");
    }
}
