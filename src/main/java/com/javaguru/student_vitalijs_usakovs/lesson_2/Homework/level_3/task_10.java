package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_10 {
    public static void main(String[] args){
        System.out.println("Пользователь, укажите радиус круга (вещественное число) : ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double perimetr = 2 * 3.14 * radius;
        double area = 3.14 * (radius * radius);

        System.out.println("Периметр круга : " + perimetr);
        System.out.println("Площадь круга : " + area);

    }
}
