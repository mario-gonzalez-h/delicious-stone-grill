package org.example;

import java.util.*;

class Sandwich {
    private Bread bread;
    private int size;
    private Meat meat;
    private boolean extraMeat;
    private Cheese cheese;
    private boolean extraCheese;
    private boolean toasted;
    private List<String> toppings = new ArrayList<>();
    private Map<String, Integer> sauces = new HashMap<>();
    private String side;
    private Drink drink;
    private boolean chips;


    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMeat(Meat meat, boolean extraMeat) {
        this.meat = meat;
        this.extraMeat = extraMeat;
    }

    public void setCheese(Cheese cheese, boolean extraCheese) {
        this.cheese = cheese;
        this.extraCheese = extraCheese;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addToppings(String... toppings) {
        this.toppings.addAll(Arrays.asList(toppings));
    }

    public void addSauces(String sauce, int quantity) {
        this.sauces.put(sauce, quantity);
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public double calculateTotal() {
        double total = 0;
        total += (size == 4) ? 5.50 : (size == 8) ? 7.00 : 8.50;
        if (bread != null) total += bread.getPrice(size);
        if (meat != null) total += meat.getPrice(size);
        if (extraMeat) total += (size / 4) * 0.5;
        if (cheese != null) total += cheese.getPrice(size);
        if (extraCheese) total += (size / 4) * 0.3;
        if (drink != null) total += drink.getPrice();
        if (chips) total += 1.5;
        return total;
    }

    public String getReceiptDetails() {
        StringBuilder receipt = new StringBuilder();
        double basePrice = (size == 4) ? 5.50 : (size == 8) ? 7.00 : 8.50;
        receipt.append(String.format("Base Price (%d inches): $%.2f\n", size, basePrice));
        if (bread != null) receipt.append(String.format("Bread (%s): $%.2f\n", bread.getDescription(), bread.getPrice(size)));
        if (meat != null) {
            receipt.append(String.format("Meat (%s): $%.2f\n", meat.getDescription(), meat.getPrice(size)));
            if (extraMeat) receipt.append(String.format("Extra Meat: $%.2f\n", (size / 4) * 0.5));
        }
        if (cheese != null) {
            receipt.append(String.format("Cheese (%s): $%.2f\n", cheese.getDescription(), cheese.getPrice(size)));
            if (extraCheese) receipt.append(String.format("Extra Cheese: $%.2f\n", (size / 4) * 0.3));
        }
        if (toasted) receipt.append("Toasted: No additional cost\n");
        if (!toppings.isEmpty()) {
            receipt.append("Toppings: ");
            receipt.append(String.join(", ", toppings));
            receipt.append(" No additional cost\n");
        }
        if (!sauces.isEmpty()) {
            receipt.append("Sauces:");
            for (Map.Entry<String, Integer> entry : sauces.entrySet()) {
                receipt.append(String.format("%s (x%d): No additional cost\n", entry.getKey(), entry.getValue()));
            }
        }
        if (side != null) receipt.append(String.format("Side (%s): No additional cost\n", side));
        if (drink != null) receipt.append(String.format("Drink (%s): $%.2f\n", drink.getDescription(), drink.getPrice()));
        if (chips) receipt.append("Chips: $1.50\n");
        receipt.append(String.format("Total: $%.2f\n", calculateTotal()));
        receipt.append("*---------------------------*\n");
        return receipt.toString();
    }
}
