package oop12;

public class ATMSystem{

public void verifyPin(int enteredPin, int storedPin, int attempts)
        throws IncorrectPinException, AccountLockedException {

    if (attempts >= 3) {
        throw new AccountLockedException("Account locked due to multiple failed attempts.");
    }

    if (enteredPin != storedPin) {
        throw new IncorrectPinException("Incorrect pin! Access denied");
    }

    System.out.println("Account verified successfully.");
}
}
