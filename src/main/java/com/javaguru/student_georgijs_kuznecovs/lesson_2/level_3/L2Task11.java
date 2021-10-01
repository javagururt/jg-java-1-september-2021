package com.javaguru.student_georgijs_kuznecovs.lesson_2.level_3;

import java.util.Scanner;

public class L2Task11 {
/*    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        double firstNum = input.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNum = input.nextDouble();
        System.out.println("Введите третье число: ");
        double thirdNum = input.nextDouble();

        double mid = (firstNum + secondNum + thirdNum) / 3; // КАК ОГРНИЧИТЬ КОЛ-ВО ЗНАКОВ ПОСЛЕ ЗАПЯТОЙ???

        System.out.println("среднее арифметическое введенных чисел = " + mid);
    }*/
    public static void main(String[] args) {
        double[] nums = new double[3];                // НЕ ПОНЯЛ, ПОЧЕМУ МЕСТ В МАССИВЕ ИЗНАЧАЛЬНО СОЗДАЕТСЯ
        double result = 0;                            // НА ОДНО БОЛЬШЕ, ЕСЛИ НАЧИНАЮТ СЧИТАТЬ С НУЛЯ ???

        System.out.println("Введите первое число: ");
        Scanner input = new Scanner(System.in);
        nums[0] = input.nextDouble();
        System.out.println("Введите второе число: ");
        nums[1] = input.nextDouble();
        System.out.println("Введите третье число: ");
        nums[2] = input.nextDouble();

        for (double d : nums) {
            result += d;
        }

        System.out.println("среднее арифметическое введенных чисел = " + result / nums.length);
    }
}
