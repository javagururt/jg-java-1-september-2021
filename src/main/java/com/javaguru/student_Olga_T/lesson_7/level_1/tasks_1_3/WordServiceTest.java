package com.javaguru.student_Olga_T.lesson_7.level_1.tasks_1_3;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testCountWord();
        test.testFindMostFrequentWord();
    }

    public void testFindMostFrequentWord() {
        WordService testFindMostFrequentWordInString = new WordService();
        String result1 = testFindMostFrequentWordInString.findMostFrequentWord("a, wwpw, cccc, xxxx, xxxx, hh, hi, ww wwww");
        if (result1.equals("'xxxx,' 2")) {
            System.out.println("testFindMostFrequentWord TEST OK");
        } else {
            System.out.println("testFindMostFrequentWord TEST FAIL");
        }
    }

    public void testCountWord() {
        WordService testCountWordInString = new WordService();
        String[] testCountArray2 = {"aaa", "wwww", "cccc", "xxxx", "xxxx,", "hh,", "hh", "wwww", "wwww"};
        int result2 = testCountWordInString.countWord(testCountArray2, "wwww");
        if (result2 == 3) {
            System.out.println("testCountWord TEST OK");
        } else {
            System.out.println("testCountWord TEST FAIL");
        }
    }

}
