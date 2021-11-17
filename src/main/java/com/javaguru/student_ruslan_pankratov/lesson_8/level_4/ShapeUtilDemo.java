package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {
    public static void main(String[] args) {
       ShapeUtilDemo shapeUtilDemo = new ShapeUtilDemo();
       shapeUtilDemo.circle();
       shapeUtilDemo.square();
       shapeUtilDemo.rectangle();
       shapeUtilDemo.triangle();


    }

    void circle(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }

    void square(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double circleArea = shapeUtil.calculateArea(square);
        double circlePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }

    void rectangle(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double circleArea = shapeUtil.calculateArea(rectangle);
        double circlePerimeter = shapeUtil.calculatePerimeter(rectangle);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }
    void triangle(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double circleArea = shapeUtil.calculateArea(triangle);
        double circlePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }

}
