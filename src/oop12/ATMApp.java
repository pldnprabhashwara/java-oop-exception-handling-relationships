package oop12;
import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATMSystem atm = new ATMSystem();

        int storedPin = 1234;
        int attempts = 0;

        try{
            while(attempts < 3){
                System.out.print("Enter your PIN: ");
                int enteredPin = input.nextInt();

                try{
                    atm.verifyPin(enteredPin, storedPin, attempts);
                    break;
                }catch(IncorrectPinException e){
                    attempts++;
                    System.out.println(e.getMessage());
                    System.out.println("Attempts used: " + attempts);
                }

            }

            if(attempts >= 3){
                atm.verifyPin(0, storedPin, attempts);
            }

        }catch(AccountLockedException e){
            System.out.println("PIN Error: " + e.getMessage());
        }finally{
            System.out.println("ATM session ended.");
        }

    }
}
