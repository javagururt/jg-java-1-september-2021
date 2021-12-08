package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Task_25
@CodeReview(approved = true)
class ConvertingToHumanAge {


    public static void main(String[] args) {
        Context context = new Context(new Cat());
        System.out.println("the age of the cat at human age = " + context.convertingToHumanAgeMethod(20));

        Context context1 = new Context(new Dog());
        System.out.println("the age of the dog at human age = " + context1.convertingToHumanAgeMethod(20));


        Context context2 = new Context(new Turtle());
        System.out.println("the age of the turtle at human age = " + context2.convertingToHumanAgeMethod(20));


        Context context3 = new Context(new GreenlandShark());
        System.out.println("the age of the greenlandShark at human age = " + context3.convertingToHumanAgeMethod(20));
    }

}
