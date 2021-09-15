package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateLastName(String lastName){

        String UC2Regex= "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(UC2Regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
