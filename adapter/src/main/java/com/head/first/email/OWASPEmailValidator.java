package com.head.first.email;

import java.util.regex.Pattern;

public class OWASPEmailValidator {

    public boolean validateEmail(String email) {
        return Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")
                .matcher(email)
                .matches();
    }
}
