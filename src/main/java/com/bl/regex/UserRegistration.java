package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {

        String Regex = "^[A-Z]{1}[a-zA-Z]{2,20}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
