package oop13;
import java.util.Scanner;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LoginValidator validator = new LoginValidator();

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        try {
            validator.validate(email, password);

        } catch (InvalidEmailFormatException e) {
            System.out.println("Email Error: " + e.getMessage());

        } catch (WeakPasswordException e) {
            System.out.println("Password Error: " + e.getMessage());

        } finally {
            System.out.println("Login attempt recorded.");
            input.close();
        }
    }
}