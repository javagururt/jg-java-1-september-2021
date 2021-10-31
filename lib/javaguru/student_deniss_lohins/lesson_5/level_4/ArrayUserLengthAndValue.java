package com.javaguru.student_deniss_lohins.lesson_5.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class ArrayUserLengthAndValue {

    public static void main(String[] args) {
        ArrayUserLengthAndValue runner = new ArrayUserLengthAndValue();
        int[] array;
        array = runner.manualFill();
        runner.printResults(array);
    }


    private void printResults(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    private int[] manualFill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter array[" + i + "] value :");
            array[i] = sc.nextInt();
        }
        return array;
    }
}
