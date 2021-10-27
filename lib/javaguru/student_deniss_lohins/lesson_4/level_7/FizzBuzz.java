package com.javaguru.student_deniss_lohins.lesson_4.level_7;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

// Реализуйте следующие требования:
// - если переданное число делится на три возвращайте "Fizz"
// - если переданное число делится на пять возвращайте "Buzz"
// - если переданное число делится на три и на пять возвращайте "FizzBuzz"
// - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }else if(number % 3 == 0){
                return "Fizz";
        }else if (number % 5 == 0) {
            return "Buzz";
        } else {
            String answer = String.valueOf(number);
            return answer;
        }
    }
}
