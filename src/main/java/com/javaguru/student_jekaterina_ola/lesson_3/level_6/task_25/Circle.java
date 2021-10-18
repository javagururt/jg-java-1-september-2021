package com.javaguru.student_jekaterina_ola.lesson_3.level_6.task_25;

        //Свойства: радиус (double radius),
        //Методы: расчет площади (double calculateArea()).

public class Circle {
    private double radius;
    private double calculatedArea;
    private double PI;

    public Circle(double radius){this.radius = radius;}

    void calculatedArea(){
    double PI = 3.14;
    calculatedArea = PI * radius;}

    void finalResult(){
      System.out.println("Circle area is " + calculatedArea);}
   }
