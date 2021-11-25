package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class UserValidationDemo {

    public static void main(String[] args) {
        User user = null;

        UserValidationRule[] validationRules = {
                new UserValidationCapitalLetterNicknameRule(),
                new UserValidationNicknameMaxLengthRule(),
                new UserValidationNicknameMinLengthRule(),
                new UserValidationMinAgeRule(),
                new UserValidationMaxAgeRule()
        };

        ValidationService validationService = new ValidationService(validationRules);

        boolean result = validationService.validate(user);

        System.out.println("Validation result = " + result);
    }

}
