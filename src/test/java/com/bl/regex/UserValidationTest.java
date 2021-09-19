package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenPasswordRule3_WhenInProperFormat_ShouldReturnTrue() {

        boolean validationStatus = userRegistration.password("monaliJumde1");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenPasswordRule3_WhenNotInProperFormat_ShouldReturnFalse() {

        boolean validationStatus = userRegistration.password("monaliJumde");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenPasswordRule4_WhenInProperFormat_ShouldReturnTrue() {

        boolean validationStatus = userRegistration.password("monaliJumde@1");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenPasswordRule4_WhenNotInProperFormat_ShouldReturnFalse() {

        boolean validationStatus = userRegistration.password("monaliJumde");
        Assert.assertEquals(false, validationStatus);
    }


}