package oop13;

import oop9.InvalidAgeException;

public class LoginValidator {

    public void validate(String email, String password)
        throws InvalidEmailFormatException, WeakPasswordException{
        if(!email.contains("@")){
            throw new InvalidEmailFormatException("Invalid email format");
        }

        boolean hasDigits = false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigits = true;
                break;
            }
        }

        if(password.length() < 8 || !hasDigits){
            throw new WeakPasswordException("Weak password");
        }

        System.out.println("Login successful! Welcome.");
    }
}
