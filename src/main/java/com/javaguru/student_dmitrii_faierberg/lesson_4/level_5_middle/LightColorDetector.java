package com.javaguru.student_dmitrii_faierberg.lesson_4.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

/*
380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")
 */
@CodeReview(approved = true)
class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength < 450) return "Violet";
        else if (wavelength >= 450 && wavelength < 495) return "Blue";
        else if (wavelength >= 495 && wavelength < 570) return "Green";
        else if (wavelength >= 570 && wavelength < 590) return "Yellow";
        else if (wavelength >= 590 && wavelength < 620) return "Orange";
        else if (wavelength >= 620 && wavelength < 750) return "Red";
        else return "Invisible Light";

    }
}
