package com.example.frontFocuson.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.frontFocuson.FormLogin;

public class LoginFormTest {

    @Test
    public void testValidLogin() {
        FormLogin loginForm = new FormLogin();
        boolean isValid = loginForm.validateLogin("example@email.com", "password");
        assertTrue(isValid);
    }

    @Test
    public void testEmptyFields() {
        FormLogin loginForm = new FormLogin();
        boolean isValid = loginForm.validateLogin("", "");
        assertFalse(isValid);
    }
}
