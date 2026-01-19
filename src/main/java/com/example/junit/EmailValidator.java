package com.example.junit;

public class EmailValidator {

    public boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
