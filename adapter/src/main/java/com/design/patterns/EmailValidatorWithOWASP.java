package com.design.patterns;

import java.util.regex.Pattern;

public class EmailValidatorWithOWASP {

    public boolean validateEmail(String email) {
        return Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")
                .matcher(email)
                .matches();
    }
}
