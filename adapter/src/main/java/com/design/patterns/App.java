package com.design.patterns;

public class App {

    public static void main(String[] args) {
        var email = new Email("pedrobsantos98@outlook.com");
        EmailValidator emailValidator = new EmailValidatorAdapter();
        System.out.println(emailValidator.validate(email));
    }
}
