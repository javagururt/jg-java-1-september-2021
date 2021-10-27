//        380 ... 449 - Фиолетовый ("Violet")
//        450 ... 494 - Синий ("Blue")
//        495 ... 569 - Зеленый ("Green")
//        570 ... 589 - Желтый ("Yellow")
//        590 ... 619 - Оранжевый ("Orange")
//        620 ... 750 - Красный ("Red")
//        Вне д иапазонов - невидимый спектр ("InvisibleLight")
package com.javaguru.student_rodions_sokolovs.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.TestViolet();
        lightColorDetectorTest.TestBlue();
        lightColorDetectorTest.TestGreen();
        lightColorDetectorTest.TestYellow();
        lightColorDetectorTest.TestOrange();
        lightColorDetectorTest.TestRed();
        lightColorDetectorTest.TestInvis();

    }

    public static void TestViolet() {
        int firstnumber = 380;
        String result = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public static void TestBlue() {
        int firstnumber = 450;
        String result = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }

    }

    public static void TestGreen() {
        int firstnumber = 495;
        String result = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public static void TestYellow() {
        int firstnumber = 570;
        String result = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public static void TestOrange() {
        int firstnumber = 590;
        String result = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public static void TestRed() {
        int firstnumber = 620;
        String result = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public static void TestInvis() {
        int firstnumber = 800;
        String result = "InvisibleLight";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realresult = lightColorDetector.Light(firstnumber);
        if (result == realresult) {
            System.out.println("InvisibleLight test = OK");
        } else {
            System.out.println("InvisibleLight test = FAIL");
        }
    }
}