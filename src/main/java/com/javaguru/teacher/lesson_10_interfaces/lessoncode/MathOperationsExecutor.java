package com.javaguru.teacher.lesson_10_interfaces.lessoncode;

import java.math.BigDecimal;

class MathOperationsExecutor {

    public void execute(MathOperation[] operations, UserInputDTO userInputDTO) {
        for (int i = 0; i < operations.length; i++) {

            int firstNumber = userInputDTO.getFirstNumber();
            int secondNumber = userInputDTO.getSecondNumber();

            BigDecimal operationResult = operations[i].execute(firstNumber, secondNumber);
            String operationName = operations[i].getName();

            System.out.println(operationName + " = " + operationResult);
        }
    }
}
