package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail_ValidEmail_ReturnsTrue() throws Exception {

        EmailValidator emailValidator = new EmailValidator();
        boolean result = emailValidator.isValidEmail("test@example.com");
        assertTrue(result);
    }

    @Test
    public void testGetDomain_ValidEmail_ReturnsDomain() {
        EmailValidator emailValidator = new EmailValidator();
        String result = emailValidator.getDomain("test@example.com");
        Assertions.assertEquals("example.com", result);
    }
}
