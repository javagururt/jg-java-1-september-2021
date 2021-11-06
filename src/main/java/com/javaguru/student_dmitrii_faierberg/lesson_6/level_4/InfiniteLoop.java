package com.javaguru.student_dmitrii_faierberg.lesson_6.level_4;

class InfiniteLoop {
    public static void main(String[] args) {
        infiniteLoopUsingWhile();
        infiniteLoopUsingFor();
    }
    public static void infiniteLoopUsingWhile() {
        while (true) {
            System.out.println("The first and the last one");
            break;
        }
    }

    public static void infiniteLoopUsingFor(){
        int variable = 0;
        for(;;){
            variable++;
            System.out.print(variable + " ");
            if (variable == 10) break;
        }
    }
}
