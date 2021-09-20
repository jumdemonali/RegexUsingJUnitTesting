package com.bl.regex;
import org.junit.Test;

public class UserValidationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void WhenGiveName_IsInProperFormat_ShouldReturnTrue() {
        boolean actual = false;
        try {
            actual = userRegistration.checkName("Monali");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void WhenGiveName_IsNotInProperFormat_ShouldReturnFalse() {
        boolean actual = false;
        try {
            actual = userRegistration.checkName("MONali");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
    @Test
    public void WhenGiveLastName_IsInProperFormat_ShouldReturnTrue(){
        boolean actual = false;
        try {
            actual = userRegistration.checkLastName("Jumde");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void WhenGiveLastName_IsNotInProperFormat_ShouldReturnFalse(){
        boolean actual = false;
        try {
            actual = userRegistration.checkLastName("JUmde");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
    @Test
    public void WhenGiveEmail_IsInProperFormat_ShouldReturnTrue(){
        boolean actual = false;
        try {
            actual = userRegistration.checkEmail("Mona@123");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void WhenGiveEmail_IsNotInProperFormat_ShouldReturnFalse(){
        boolean actual=false;
        try {
            actual = userRegistration.checkEmail("jumdemonali.321");
        }
        catch (UserRegistrationException e)
        {
            System.out.println(e);
        }

    }
    @Test
    public void WhenGivePassword_IsNotInProperFormat_ShouldReturnFalse(){
        boolean actual = false;
        try {
            actual = userRegistration.checkPassword("mona@123");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void WhenGivePassward_IsInProperFormat_ShouldReturnTrue(){
        boolean actual = false;
        try {
            actual = userRegistration.checkPassword("abc");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
    @Test
    public void WhenGivePassward_IsNotInProperFormat_ShouldReturnFalse(){
        boolean actual = false;
        try {
            actual = userRegistration.checkPassword("abc");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

}
