package com.example.stockapi;

public class Stock {
    // Class members
    private String name;
    private double price;

    // Constructor
    public Stock(String name, double price) {
        this.name = name;

        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]"))
            this.name = name;
        else
            System.out.println("Please insert letters only");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Please insert positive number");
    }
}
