package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenContactWithCountryCodeAnd10Digits_shouldReturnTrue() {

        boolean validationStatus = userRegistration.validateContactNumber("91 9603165488");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenContactWithoutCountryCodeAndLessThan10Digits_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateContactNumber("9603165488");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenContactWithCountryCodeAndLessThan10Digits_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateContactNumber(" 91 9603165488");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenContactWithoutCountryCodeAndWith10Digits_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateContactNumber("9603165488");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenContactWithAlphabetsAndSpecialCharacters_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateContactNumber("960%5488");
        Assert.assertEquals(false, validationStatus);
    }

}