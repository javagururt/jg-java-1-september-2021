package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main (String[] args){
        Robot robo = new Robot();

        robo.sayHello();

        robo.name = "My name is ROBO";
        robo.sayName();

        Robot android = new Robot();

        android.sayHello();

        android.name = "My name is ANDROID";
        android.sayName();

        Robot vedro = new Robot();

        vedro.sayHello();

        vedro.name = "My name is VEDRO";
        vedro.sayName();

    }

}
