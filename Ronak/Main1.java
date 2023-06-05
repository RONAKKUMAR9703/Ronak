package com.Ronak;

public class Main1 {
    public static void main(String[] args) {
        Product p1 = new Product("Product 1", 10.99, 20);
        Product p2 = new Product("Product 2", 5.99, 15);
        Product p3 = new Product("Product 3", 7.99, 30);
        
        p1.sell(5);
        p2.sell(10);
        p3.sell(20);
        
        System.out.println("Total quantity of products sold: " + Product.getTotalSold());

}
    }