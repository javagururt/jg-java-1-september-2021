package com.javaguru.teacher.lesson_10_interfaces.lessoncode;

import java.math.BigDecimal;

class SumOperationImpl implements MathOperation {

    private static final String OPERATION_NAME = "Sum";

    @Override
    public BigDecimal execute(int a, int b) {
        int result = a + b;
        return new BigDecimal(result);
    }

    @Override
    public String getName() {
        return OPERATION_NAME;
    }
}
