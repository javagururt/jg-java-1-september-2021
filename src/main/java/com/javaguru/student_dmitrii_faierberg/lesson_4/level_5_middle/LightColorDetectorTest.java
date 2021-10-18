package com.javaguru.student_dmitrii_faierberg.lesson_4.level_5_middle;

class LightColorDetectorTest {
    public static void main(String[] args) {
        var detector = new LightColorDetectorTest();
        detector.shouldBeVioletTest();
        detector.shouldBeBlueTest();
        detector.shouldBeGreenTest();
        detector.shouldBeGreenTest();
        detector.shouldBeYellowTest();
        detector.shouldBeOrangeTest();
        detector.shouldBeRedTest();
        detector.shouldBeInvisibleTest();
    }

    public void shouldBeVioletTest(){
        int wavelength = 390;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Violet")) System.out.println("shouldBeVioletTest = OK");
        else System.err.println("shouldBeVioletTest = FAIL");
    }

    public void shouldBeBlueTest(){
        int wavelength = 480;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Blue")) System.out.println("shouldBeBlueTest = OK");
        else System.err.println("shouldBeBlueTest = FAIL");
    }

    public void shouldBeGreenTest(){
        int wavelength = 510;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Green")) System.out.println("shouldBeGreenTest = OK");
        else System.err.println("shouldBeGreenTest = FAIL");
    }

    public void shouldBeYellowTest(){
        int wavelength = 575;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Yellow")) System.out.println("shouldBeYellowTest = OK");
        else System.err.println("shouldBeYellowTest = FAIL");
    }

    public void shouldBeOrangeTest(){
        int wavelength = 600;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Orange")) System.out.println("shouldBeOrangeTest = OK");
        else System.err.println("shouldBeOrangeTest = FAIL");
    }

    public void shouldBeRedTest(){
        int wavelength = 700;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Red")) System.out.println("shouldBeRedTest = OK");
        else System.err.println("shouldBeRedTest = FAIL");
    }

    public void shouldBeInvisibleTest(){
        int wavelength = 800;
        var detector = new LightColorDetector();
        String result = detector.detect(wavelength);
        if (result.equals("Invisible Light")) System.out.println("shouldBeInvisibleTest = OK");
        else System.err.println("shouldBeInvisibleTest = FAIL");
    }


}
