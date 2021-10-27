//Разработать программу,
//        которая работает в соответствии с требованиями, описанными ниже.
//
//        Функциональные требования:
//        Программа должна определять цвет в зависимости
//        от длины волны в соответствии со следующими правилами:
//
//        380 ... 449 - Фиолетовый ("Violet")
//        450 ... 494 - Синий ("Blue")
//        495 ... 569 - Зеленый ("Green")
//        570 ... 589 - Желтый ("Yellow")
//        590 ... 619 - Оранжевый ("Orange")
//        620 ... 750 - Красный ("Red")
//        Вне д иапазонов - невидимый спектр ("InvisibleLight")
//
//        Логика с определением цвета должна быть реализована
//        в отдельном классе LightColorDetector:
//
//class LightColorDetector {
//
//    public String detect(int wavelength) {
//        //TODO
//    }
//
//}
//
//    Написать тестовые сценарии для класса LightColorDetector
//    в классе LightColorDetectorTest. Тестовые сценарии должны
//        покрывать все возможные варианты.


package com.javaguru.student_rodions_sokolovs.lesson_4.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LightColorDetector {

    public String Light(int firstnumber) {
        if (firstnumber >= 380 && firstnumber <= 449) {
            return "Violet";
        } else if (firstnumber >= 450 && firstnumber <= 494) {
            return "Blue";
        } else if (firstnumber >= 495 && firstnumber <= 569) {
            return "Green";
        } else if (firstnumber >= 570 && firstnumber <= 589) {
            return "Yellow";
        } else if (firstnumber >= 590 && firstnumber <= 619) {
            return "Orange";
        } else if (firstnumber >= 620 && firstnumber <= 750) {
            return "Red";
        } else {
            return "InvisibleLight";
        }

    }
}
