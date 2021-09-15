package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateContactNumber(String contactNumber) {

        String Regex = "^[0-9]{1}[0-9]{1}\\s{0,1}[7-9]{1}[0-9]{9}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(contactNumber);
        return matcher.matches();
    }

}
