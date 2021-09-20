package com.bl.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scan = new Scanner(System.in);

    public boolean checkName(String name) throws UserRegistrationException {

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);

        if (!matcher.matches()){
            throw new UserRegistrationException("First Name is Invalid");
        }
        return matcher.matches();

    }

    public boolean checkLastName(String lastName) throws UserRegistrationException {

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(lastName);

        if (!matcher.matches()){
            throw new UserRegistrationException("Last Name is Invalid");
        }
        return matcher.matches();
    }

    public boolean checkEmail(String email) throws UserRegistrationException{

        String emailRegex = "^[a-zA-Z0-9]+.[a-zA-Z0-9+_-]+@[a-zA-Z0-9+_-]+.[a-z]+.[a-z]+$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()){
            try {
                throw new UserRegistrationException("Invalid Email");
            } catch (UserRegistrationException e) {
                System.out.println(e);
            }
        }
        return matcher.matches();
    }

    void checkPhone(long number) throws UserRegistrationException{
        System.out.println("Enter Your phone number");
        String phoneNo = scan.next();

        String Regex = "^[91]{2}\\s[0-9]{10}$";

        boolean result = phoneNo.matches(Regex);
        if (!result){
            try {
                throw new UserRegistrationException("Phone Number is Invalid");
            } catch (UserRegistrationException e) {
                System.out.println(e);
            }
        }
    }

    public boolean checkPassword(String password) throws UserRegistrationException {

        String Regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!#%*?&])[A-Za-z\\d@$!#%*?&]{8,}$";

        boolean result = password.matches(Regex);

        if (!result){
            throw new UserRegistrationException("Password is Invalid");
        }
        return result;
    }

}