package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenContactWithCountryCodeAnd10Digits_shouldReturnTrue() {

        boolean validationStatus = userRegistration.password("monaliJumde");
        Assert.assertEquals(true, validationStatus);
    }


}