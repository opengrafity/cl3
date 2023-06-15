package dev.grafity;

import dev.grafity.exceptions.CheckoutFailedException;

public class PurchasePage {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Checkout checkout = new Checkout();
        try{
            checkout.checkout(cart);
        }catch (CheckoutFailedException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause().getMessage());
        }
    }
}
