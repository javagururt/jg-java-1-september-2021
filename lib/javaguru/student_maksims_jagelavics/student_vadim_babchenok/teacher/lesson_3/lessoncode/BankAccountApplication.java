package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_3.lessoncode;

class BankAccountApplication {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John Doe");
        bankAccount.printInformation();
        bankAccount.deposit(1000);
        bankAccount.printInformation();
        bankAccount.deposit(500);
        bankAccount.printInformation();
    }
}
