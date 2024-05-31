package org.example;

class Meat implements SandwichComponent {
    private String type;
    private double[] prices;

    public Meat(String type, double[] prices) {
        this.type = type;
        this.prices = prices;
    }

    @Override
    public double getPrice(int size) {
        return prices[size / 4 - 1];
    }

    @Override
    public String getDescription() {
        return type;
    }
}