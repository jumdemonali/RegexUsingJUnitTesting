package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenContactWithCountryCodeAnd10Digits_shouldReturnTrue() {

        boolean validationStatus = userRegistration.password("MonaliJumde");
        Assert.assertEquals(true, validationStatus);
    }


}