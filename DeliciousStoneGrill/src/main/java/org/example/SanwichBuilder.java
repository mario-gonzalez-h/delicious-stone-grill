package org.example;

import java.util.*;

class SandwichBuilder {
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

    public SandwichBuilder setBread(Bread bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public SandwichBuilder setMeat(Meat meat, boolean extraMeat) {
        this.meat = meat;
        this.extraMeat = extraMeat;
        return this;
    }

    public SandwichBuilder setCheese(Cheese cheese, boolean extraCheese) {
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        return this;
    }

    public SandwichBuilder setToasted(boolean toasted) {
        this.toasted = toasted;
        return this;
    }

    public SandwichBuilder addToppings(String... toppings) {
        this.toppings.addAll(Arrays.asList(toppings));
        return this;
    }

    public SandwichBuilder addSauces(String sauce, int quantity) {
        this.sauces.put(sauce, quantity);
        return this;
    }

    public SandwichBuilder setSide(String side) {
        this.side = side;
        return this;
    }

    public SandwichBuilder setDrink(Drink drink) {
        this.drink = drink;
        return this;
    }

    public SandwichBuilder setChips(boolean chips) {
        this.chips = chips;
        return this;
    }

    public Sandwich build() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBread(bread);
        sandwich.setSize(size);
        sandwich.setMeat(meat, extraMeat);
        sandwich.setCheese(cheese, extraCheese);
        sandwich.setToasted(toasted);
        sandwich.addToppings(toppings.toArray(new String[0]));
        sauces.forEach(sandwich::addSauces);
        sandwich.setSide(side);
        sandwich.setDrink(drink);
        sandwich.setChips(chips);
        return sandwich;
    }
}

