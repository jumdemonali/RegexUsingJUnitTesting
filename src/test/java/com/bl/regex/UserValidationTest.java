package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenEmailWithSpecialCharactersAtProperPlaces_shouldReturnTrue(){

        boolean validationStatus = userRegistration.validateEmail("jumdemonali@gmail.com");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenEmailWithSpecialCharactersNotAtProperPlaces_shouldReturnFalse(){

        boolean validationStatus = userRegistration.validateEmail("jumde123gmailcom");
        Assert.assertEquals(false,validationStatus);
    }
}