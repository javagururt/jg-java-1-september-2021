package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class TaskService {
/*
    void userInsertArrayLength(int array){
        System.out.println("Please insert the length of array : ");
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();
    }
*/
    void userInsertNumber(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Please insert " + i + " number : ");
            Scanner sc = new Scanner(System.in);
            numbers[i] = sc.nextInt();
        }
    }

    void randomizer(int[] numbers){
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(100);
        }
    }

    void greatestNumber(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The greatest number: " + max);
    }

    void lowestNumber(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("The lowest number: " + min);
    }

    void evenNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }

    }

    void oddNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }

    }
}/*
for (int even : numbers){
            if (even % 2 == 0){
                System.out.println(even);
            }
        }*/

