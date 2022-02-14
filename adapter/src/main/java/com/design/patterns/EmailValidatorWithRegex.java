package com.design.patterns;

import java.util.regex.Pattern;

public class EmailValidatorWithRegex {

    public boolean validateEmail(String email) {
        return Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches();
    }
}
