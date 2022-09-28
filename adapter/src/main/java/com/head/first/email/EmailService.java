package com.head.first.email;

public class EmailService {
    
    private EmailValidator emailValidator;

    public EmailService(EmailValidator emailValidator) {
        this.emailValidator = emailValidator;
    }

    public boolean validateEmail(String email) {
        return this.emailValidator.isValid(email);
    }
}
