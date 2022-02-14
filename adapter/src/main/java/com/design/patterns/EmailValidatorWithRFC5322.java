package com.design.patterns;

import java.util.regex.Pattern;

public class EmailValidatorWithRFC5322 {
    
    public boolean validateEmail(String email) {
        return Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
                .matcher(email)
                .matches();
    }
}
