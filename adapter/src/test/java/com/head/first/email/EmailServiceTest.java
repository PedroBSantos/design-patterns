package com.head.first.email;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmailServiceTest {
    
    @Test
    public void test1() {
        var emailValidatorAdapter = new EmailOWASPValidatorAdapter(new OWASPEmailValidator());
        var emailService = new EmailService(emailValidatorAdapter);
        var email = "email@email.com";
        assertTrue(emailService.validateEmail(email));
    }
}
