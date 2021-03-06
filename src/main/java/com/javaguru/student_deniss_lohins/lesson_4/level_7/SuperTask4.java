package com.javaguru.student_deniss_lohins.lesson_4.level_7;
/*
        Дан класс LightColorDetector и его тест LightColorDetectorTest.
        Найдите способ упростить тесты в LightColorDetectorTest.

        Тесты тоже должны быть написаны как можно лучше и качественнее!
        Дублирование кода - это почти всегда плохая идея в программировании.
        Поэтому от дублирования кода нужно избавляться.

        Подсказка: вынесите в отдельный метод проверку
        результата и замените её вызовом метода в каждом тесте.

        Инстанция класса LightColorDetector не имеет состояния,
        она stateless. Найдите в интернете, что такое stateless класс
        в программировании. Найдите способ использовать одну
        инстанцию класса LightColorDetector для всех тестов.*/

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Blue"), "Blue");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Green"), "Green");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Yellow"), "Yellow");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Orange"), "Orange");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Red"), "Red");
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        checkResults(result.equals("Invisible Light"), "Invisible Light");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println("LightColorTest - " + testName + " = OK");
        } else {
            System.err.println("LightColorTest - " + testName + " = FAIL");
        }
    }
}

class SuperTask4 {
}
