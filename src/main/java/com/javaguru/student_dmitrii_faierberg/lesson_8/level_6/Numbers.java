package com.javaguru.student_dmitrii_faierberg.lesson_8.level_6;

class Numbers {
    static void printNumbers(String s, int... nums){
        System.out.println("First parameter: " + s);
        System.out.print("varags: ");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        printNumbers("+", 1);
        printNumbers("+", 1, 2, 3);
        printNumbers("+");

    }
}
