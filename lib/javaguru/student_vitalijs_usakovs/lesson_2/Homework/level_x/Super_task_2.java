package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_x;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

/* Исправьте ошибки компиляции в данной программе.
public class SumTwoNumbers {
	public static void main(String[] args) {
		int numberOne;
		int numberTwo;
		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);
		int numberOne = 10;
		int numberTwo = 20;
		int sum = numberOne + numberTwo;
		System.out.println("Sum = " + sum);
*/
@CodeReview(approved = true)
public class Super_task_2 {
   public static void main(String [] args){
        System.out.println("Please enter first number : ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

       System.out.println("Please enter second number : ");
       int number2 = input.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum = " + sum);

            System.out.print("First number was :" + number1);
            System.out.println("; Second number was :" + number2);
    }

    /*public static void main(String [] args){
    int number1 = 10;
    int number2 = 20;
    int sum = number1 + number2;
    System.out.println("Sum : " + sum);
}
*/
}
