package dev.grafity;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        Cart cart = new Cart();
        try {
            Product prod1 = new Product(1, "Mic", 1000);
            Product prod2 = new Product(2, "Speaker", 3000);
            Product prod3 = new Product(3, "tablet", 1000);
            Product prod4 = new Product(4, "Projector", 2000);
            Product prod5 = new Product(5, "laptop", 5000);
            Product prod6 = new Product(6, "harddisk", 5500);
            cart.addProduct(prod1);
            cart.addProduct(prod2);
            cart.addProduct(prod3);
            cart.addProduct(prod4);
            cart.addProduct(prod5);
            cart.addProduct(prod6);
        }catch(CartIsFullException ex){
            System.out.println("<html><body><h1 style='color:red'>"+ex.getMessage()+"</h1></body></html>");
        }finally {
            System.out.println(cart.getTotalPrice());
        }
    }
}