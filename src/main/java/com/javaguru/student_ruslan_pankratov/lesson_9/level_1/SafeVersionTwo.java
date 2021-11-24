package com.javaguru.student_ruslan_pankratov.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeVersionTwo {

    private int pinCode;
    private int amountOfMoney;

    public SafeVersionTwo(int pinCode, int amountOfMoney) {
        this.pinCode = pinCode;
        this.amountOfMoney = amountOfMoney;
    }

    void getMoney(int pinCode, int getMoney){
       if(this.pinCode == pinCode){
           amountOfMoney = amountOfMoney - getMoney;
           System.out.println("На счету осталось " + amountOfMoney);
       } else {
           System.out.println("Не верный пароль");
       }
   }
   void putMoney(int pinCode, int getMoney){
       if(this.pinCode == pinCode){
           amountOfMoney = amountOfMoney - getMoney;
           System.out.println("На счету теперь " + amountOfMoney);
       } else {
           System.out.println("Не верный пароль");
       }
   }
}
