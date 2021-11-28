package com.javaguru.teacher.lesson_10_interfaces.lessoncode;

class MathOperationsDemo {

    public static void main(String[] args) {
        UserConsoleInput userConsoleInput = new UserConsoleInput();
        UserInputDTO userInputDTO =  userConsoleInput.getUserInput();

        MathOperation sumOperation = new SumOperationImpl();
        MathOperation subtractOperation = new SubtractMathOperationImpl();
        MathOperation[] operations = {
                sumOperation,
                subtractOperation
        };

        MathOperationsExecutor executor = new MathOperationsExecutor();
        executor.execute(operations, userInputDTO);
    }
}
