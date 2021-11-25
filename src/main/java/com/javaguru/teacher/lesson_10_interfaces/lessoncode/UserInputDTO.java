package com.javaguru.teacher.lesson_10_interfaces.lessoncode;
// DTO = Data Transfer Object
class UserInputDTO {

    private int firstNumber;
    private int secondNumber;

    public UserInputDTO(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public String toString() {
        return "UserInputDTO{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
