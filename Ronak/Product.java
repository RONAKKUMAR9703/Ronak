package com.Ronak;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
        } else {
            System.out.println("Insufficient quantity of " + this.name + " available.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

