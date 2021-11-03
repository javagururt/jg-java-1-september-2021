package com.javaguru.student_dmitrii_faierberg.lesson_5.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil utilite = new ArrayUtil();
        int length = 5;
        int[] victim = utilite.createArray(5);
        int[] expected = new int[length];
        for(int i = 0; i < length; i++){
            if (victim[i] != expected[i]){
                System.err.println("shouldCreateArray = False");
                return;
            }
        }
        System.out.println("shouldCreateArray = True");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil utilite = new ArrayUtil();
        int length = 5;
        int[] victim = new int[length];
        int[] expected = new int[length];
        utilite.fillArrayWithRandomNumbers(victim);
        if (victim.equals(expected)) {
            System.err.println("shouldFillArrayWithRandomNumbers = False");
        } else{
            System.out.println("shouldFillArrayWithRandomNumbers = True");
        }
    }

    public void shouldFindMaxNumber() {
        var victim = new ArrayUtil();
        int[] array = {1,5,7,2,3,4};
        int expected = 7;
        if (victim.findMaxNumber(array) == expected){
            System.out.println("shouldFindMaxNumber = True");
        } else {
            System.err.println("shouldFindMaxNumber = False");
        }
    }

    public void shouldFindMinNumber() {
        var victim = new ArrayUtil();
        int[] array = {1,5,7,2,3,4};
        int expected = 1;
        if (victim.findMinNumber(array) == expected){
            System.out.println("shouldFindMinNumber = True");
        } else {
            System.err.println("shouldFindMinNumber = False");
        }
    }
}
