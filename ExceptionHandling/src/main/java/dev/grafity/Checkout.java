package dev.grafity;

import dev.grafity.exceptions.*;

public class Checkout {
    public void checkout(Cart cart) throws CheckoutFailedException {

        try {
            validate(cart);
            proceedForPayment(cart);
        }catch(PaymentFailedException | ValidationException ex){
            throw new CheckoutFailedException("Checkout Failed",ex);
        }
    }

    private void proceedForPayment(Cart cart) throws PaymentFailedException {
        PaymentGateway gateway = new PaymentGateway();
        try{
            gateway.makePayment(cart.getTotalPrice());
        }catch(AmountTranferException | PaymentChoiceException ex){
            throw new PaymentFailedException(ex);
        }
    }

    public void validate(Cart cart) throws ValidationException {
        boolean isValid = true;
        if(!isValid) {
            throw new ValidationException();
        }

    }
    
}
