package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean password(String password) {
        String regex = "^(?=.*[0-9])[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("\nYour password " + password + " is in correct format.");
        } else {
            System.out.println("\nYour password is not in correct format.");
        }
        return matcher.matches();
    }
}
