package com.javaguru.student_deniss_lohins.lesson_4.level_1;

class DayOfWeek {
    private int numberOfDay;

    void dayOfWheek(int numberOfDay){
      if (numberOfDay > 0 && numberOfDay < 8) {
          if (numberOfDay == 1){
              System.out.println("Monday");
          }else if(numberOfDay == 2){
              System.out.println("Tuesday");
          }else if (numberOfDay == 3){
              System.out.println("Wednesday");
          }else if (numberOfDay == 4){
              System.out.println("Thursday");
          }else if (numberOfDay == 5){
              System.out.println("Friday");
          }else if (numberOfDay == 6){
              System.out.println("Saturday");
          }else if (numberOfDay == 7){
              System.out.println("Sunday");
          }
      }else{
          System.err.println("Wrong input");
      }
    }
}
