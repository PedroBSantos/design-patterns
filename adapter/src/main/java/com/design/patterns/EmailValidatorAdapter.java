package com.design.patterns;

public class EmailValidatorAdapter implements EmailValidator {

    private final EmailValidatorWithRFC5322 emailValidatorAdaptee;

    public EmailValidatorAdapter() {
        this.emailValidatorAdaptee = new EmailValidatorWithRFC5322();
    }

    @Override
    public boolean validate(Email email) {
        return this.emailValidatorAdaptee.validateEmail(email.getAddress());
    }
}
