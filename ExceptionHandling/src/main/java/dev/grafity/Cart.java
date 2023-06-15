package dev.grafity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> prods = new ArrayList<>();
    public boolean addProduct(Product product) throws CartIsFullException{
       if (prods.size() < 5) {
           return prods.add(product);
       } else {
           throw new CartIsFullException("Cart is full, please go ahead to checkout");
       }
    }
    public double getTotalPrice(){
        double sum = 0;
        for(Product product:prods){
            sum = sum +product.getPrice();
        }
        return sum;
    }
}
