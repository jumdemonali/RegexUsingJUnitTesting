package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void whenGivenLastNameWith1stCapitalLetter_shouldReturnTrue(){

        boolean validationStatus = userRegistration.validateLastName("Jumde");
        Assert.assertEquals(true,validationStatus);
    }

    @Test
    public void whenGivenLastNameWith1stLetterNotCapital_shouldReturnFalse(){

        boolean validationStatus = userRegistration.validateLastName("jumde");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameContainNumericValue_shouldReturnFalse(){

        boolean validationStatus = userRegistration.validateLastName("jumde95");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameContainSpecialCharacter_shouldReturnFalse(){

        boolean validationStatus = userRegistration.validateLastName("Jumde@95");
        Assert.assertEquals(false,validationStatus);
    }

    @Test
    public void whenGivenLastNameIsLessThan3Characters_shouldReturnFalse(){

        boolean validationStatus = userRegistration.validateLastName("Ju");
        Assert.assertEquals(false,validationStatus);
    }
}