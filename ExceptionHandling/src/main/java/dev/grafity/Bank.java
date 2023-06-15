package dev.grafity;

import dev.grafity.exceptions.InvalidCredentailsException;
import dev.grafity.exceptions.NotEnoughMoneyException;

public class Bank {
    public void transfer(String choice, String credentials, Double amount) throws InvalidCredentailsException, NotEnoughMoneyException {
        boolean areCredentailsValid = true;
        boolean isSufficientMoneyAvailable = true;

        if(!areCredentailsValid){
            throw new InvalidCredentailsException("Provided Credentials Are Not Valid");
        }

        if(!isSufficientMoneyAvailable){
            throw new NotEnoughMoneyException("Insufficient Funds");
        }
    }
}
