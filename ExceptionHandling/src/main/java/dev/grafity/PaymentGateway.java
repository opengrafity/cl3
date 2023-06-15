package dev.grafity;

import dev.grafity.exceptions.*;

public class PaymentGateway {
    public void makePayment(Double amount) throws PaymentChoiceException, AmountTranferException {
        try {
            String choice = getPaymentChoice(amount);
            String credentials = getPaymentCredentials(choice);
            Bank bank = new Bank();
            bank.transfer(choice, credentials, amount);
        }catch(ChoiceNotMadeException | PopupNotOpenedException | CredentialsNotProvidedException ex){
            throw new PaymentChoiceException(ex);
        }catch (InvalidCredentailsException | NotEnoughMoneyException ex){
            throw new AmountTranferException(ex);
        }
    }

    private String getPaymentChoice(Double amount) throws PopupNotOpenedException, ChoiceNotMadeException {
        boolean showPaymentChoicePopup = true;
        boolean choiceMade = true;
        if(!showPaymentChoicePopup){
            throw new PopupNotOpenedException("Can not open popup page, popups restricted");
        }
        if(!choiceMade){
            throw new ChoiceNotMadeException("User have not chosen any payment option");
        }
        return "choice:internetbanking";
    }

    private String getPaymentCredentials(String choice) throws PopupNotOpenedException, CredentialsNotProvidedException {
        boolean showCredentialsPopup = true;
        boolean choiceMade = false;
        if(!showCredentialsPopup){
            throw new PopupNotOpenedException("Can not open popup page for credentials, popups restricted");
        }
        if(!choiceMade){
            throw new CredentialsNotProvidedException("User have not chosen any payment option");
        }
        return "username:password";
    }
}
