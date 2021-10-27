package com.javaguru.student_Olga_T.lesson_4.level_5.task_16;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testViolet();
        test.testBlue();
        test.testGreen();
        test.testYellow();
        test.testOrange();
        test.testRed();
        test.testInvisibleLight();
    }

    public void testViolet() {
        LightColorDetector detect = new LightColorDetector();
        String checkViolet = detect.detect(380);
        if (checkViolet == "Violet") {
            System.out.println("testViolet OK");
        } else {
            System.out.println("testViolet FAIL");
        }
    }

    public void testBlue() {
        LightColorDetector detect = new LightColorDetector();
        String checkBlue = detect.detect(450);
        if (checkBlue == "Blue") {
            System.out.println("testBlue OK");
        } else {
            System.out.println("testBlue FAIL");
        }
    }

    public void testGreen() {
        LightColorDetector detect = new LightColorDetector();
        String checkGreen = detect.detect(495);
        if (checkGreen == "Green") {
            System.out.println("testGreen OK");
        } else {
            System.out.println("testGreen FAIL");
        }
    }

    public void testYellow() {
        LightColorDetector detect = new LightColorDetector();
        String checkYellow = detect.detect(570);
        if (checkYellow == "Yellow") {
            System.out.println("testYellow OK");
        } else {
            System.out.println("testYellow FAIL");
        }
    }

    public void testOrange() {
        LightColorDetector detect = new LightColorDetector();
        String checkOrange = detect.detect(590);
        if (checkOrange == "Orange") {
            System.out.println("testOrange OK");
        } else {
            System.out.println("testOrange FAIL");
        }
    }

    public void testRed() {
        LightColorDetector detect = new LightColorDetector();
        String checkRed = detect.detect(620);
        if (checkRed == "Red") {
            System.out.println("testRed OK");
        } else {
            System.out.println("testRed FAIL");
        }
    }

    public void testInvisibleLight() {
        LightColorDetector detect = new LightColorDetector();
        String checkinvisibleLight = detect.detect(5);
        if (checkinvisibleLight == "Invisible Light") {
            System.out.println("invisibleLight OK");
        } else {
            System.out.println("invisibleLight FAIL");
        }
    }
}
