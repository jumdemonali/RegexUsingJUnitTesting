package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenFirstNameWith1stCapitalLetter_shouldReturnTrue() {

        boolean validationStatus = userRegistration.validateFirstName("Monali");
        Assert.assertEquals(true, validationStatus);
    }

    @Test
    public void whenGivenFirstNameWith1stLetterNotCapital_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("monali");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainNumericValue_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("Monali95");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameContainSpecialCharacter_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("Monali@95");
        Assert.assertEquals(false, validationStatus);
    }

    @Test
    public void whenGivenFirstNameIsLessThan3Characters_shouldReturnFalse() {

        boolean validationStatus = userRegistration.validateFirstName("Mo");
        Assert.assertEquals(false, validationStatus);
    }
}
