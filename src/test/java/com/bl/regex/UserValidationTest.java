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
    public void WhenGivenEmail1_IsInProperFormat_ShouldReturnTrue()  {
        boolean result = userRegistration.emailSamples("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void WhenGivenEmail1_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail3_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc123@gmail.a –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail4_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc123@.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail5_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples(".abc@abc.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail6_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc.@gmail.com –");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail7_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc@abc@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void WhenGivenEmail8_IsNotInProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailSamples("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }

}

