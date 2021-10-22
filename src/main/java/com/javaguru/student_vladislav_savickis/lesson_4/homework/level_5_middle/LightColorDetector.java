package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_5_middle;

class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 489){
            System.out.println("Color: Violet");
        } else if (wavelength >= 490 && wavelength <= 494) {
            System.out.println("Color: Blue");
        } else if (wavelength >= 495 && wavelength <= 569) {
            System.out.println("Color: Green");
        } else if (wavelength >= 570 && wavelength <= 589) {
            System.out.println("Color: Yellow");
        } else if (wavelength >= 590 && wavelength <= 619) {
            System.out.println("Color: Orange");
        } else if (wavelength >= 620 && wavelength <= 750) {
            System.out.println("Color: Red");
        } else {
            System.out.println("Color: Invisible Light");

        }
        return null;
    }
}
