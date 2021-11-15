package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;


class MAthOperationDemo {

    public static void main(String[] args) {
        // build and calculate: 10 + 20
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        System.out.println("Left side Addition result = " + addition.calculate());

        // build and calculate: 50 - 20
        Argument arg3 = new Argument(50);
        Argument arg4 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        System.out.println("Right side Subtraction result = " + addition.calculate());

        // build and calculate: (10 + 20) + (50 - 20)
        MathOperation addition1 = new Addition(addition, subtraction);
        System.out.println("Final Addition result = " + addition1.calculate());

        //(10 - 5) * (20 / 5).
        Argument args5 = new Argument(10);
        Argument args6 = new Argument(5);
        MathOperation subtraction1 = new Subtraction(args5, args6);
        System.out.println(subtraction1.calculate());

        Argument args7 = new Argument(20);
        Argument args8 = new Argument(5);
        MathOperation division = new Division(args7, args8);//4
        System.out.println(division.calculate());

        MathOperation multiplication = new Multiplication(subtraction1, division);
        System.out.println("Final Addition result = " + multiplication.calculate());


    }

}
