package com.example.projetofirebase.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import android.content.Context;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.projetofirebase.FormLogin;

import org.junit.Test;

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
