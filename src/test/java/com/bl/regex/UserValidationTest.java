package com.bl.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void WhenGivenEmail_IsInProperFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailSamples("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void WhenGivenEmail_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailSamples("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }

}

