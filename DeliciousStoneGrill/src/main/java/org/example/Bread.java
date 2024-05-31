package org.example;

class Bread implements SandwichComponent {
    private String type;
    private double price;

    public Bread(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double getPrice(int size) {
        return price;
    }

    @Override
    public String getDescription() {
        return type;
    }
}

