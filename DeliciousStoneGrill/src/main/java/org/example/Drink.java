package org.example;

class Drink {
    private String size;
    private double price;

    public Drink(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return size;
    }
}
