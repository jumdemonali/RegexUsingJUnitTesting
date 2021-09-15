package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateEmail(String email){

        String Regex= "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
