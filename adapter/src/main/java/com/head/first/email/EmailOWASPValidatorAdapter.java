package com.head.first.email;

public class EmailOWASPValidatorAdapter implements EmailValidator {

    private OWASPEmailValidator emailValidator;

    public EmailOWASPValidatorAdapter(OWASPEmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    @Override
    public boolean isValid(String email) {
        return this.emailValidator.validateEmail(email);
    }
}
