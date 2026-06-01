package oop9;
import java.util.Scanner;

public class BankApp {

    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be between 18 years old");
        }
    }

    public static void validateBalance(double balance) throws InvalidBalanceException{

        if(balance < 0){
            throw new InvalidBalanceException("Account Balance cannot be negative");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.print("Please enter your balance: ");
        double balance = input.nextDouble();

        try{
            validateAge(age);
            validateBalance(balance);

            System.out.println("Account created successfully");

        }catch(InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());

        }catch(InvalidBalanceException e){

            System.out.println("Error: " + e.getMessage());

        } finally{

            System.out.println("Validation process completed");

        }
    }
}
