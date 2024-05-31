package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    @Test
    void testBasicSandwich() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(8.50, total);
    }

    @Test
    void testSandwichWithMeat() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);
        builder.setBread(new Bread("White Bread", 0));
        builder.setMeat(new Meat("Steak", new double[]{1.0, 2.0, 3.0}), false);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(11.50, total);
    }

    @Test
    void testSandwichWithExtraMeat() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);
        builder.setBread(new Bread("White Bread", 0));
        builder.setMeat(new Meat("Steak", new double[]{1.0, 2.0, 3.0}), true);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(13.00, total);
    }

    @Test
    void testSandwichWithCheese() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);
        builder.setBread(new Bread("White Bread", 0));
        builder.setCheese(new Cheese("Cheddar", new double[]{0.75, 1.5, 2.25}), false);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(10.75, total);
    }

    @Test
    void testSandwichWithExtraCheese() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);
        builder.setBread(new Bread("White Bread", 0));
        builder.setCheese(new Cheese("Cheddar", new double[]{0.75, 1.5, 2.25}), true);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(11.65, total);
    }

    @Test
    void testFullSandwich() {
        // Arrange
        SandwichBuilder builder = new SandwichBuilder();
        builder.setSize(12);
        builder.setBread(new Bread("White Bread", 0));
        builder.setMeat(new Meat("Steak", new double[]{1.0, 2.0, 3.0}), true);
        builder.setCheese(new Cheese("Cheddar", new double[]{0.75, 1.5, 2.25}), true);
        builder.addToppings("Lettuce", "Tomato", "Onion");
        builder.addSauces("Mayo", 2);
        builder.setDrink(new Drink("Large", 3.0));
        builder.setChips(true);

        // Act
        Sandwich sandwich = builder.build();
        double total = sandwich.calculateTotal();

        // Assert
        assertEquals(20.65, total);
    }

    @Test
    void testRemoveSandwich() {
        // Arrange
        SandwichBuilder builder1 = new SandwichBuilder();
        builder1.setSize(12);
        Sandwich sandwich1 = builder1.build();

        SandwichBuilder builder2 = new SandwichBuilder();
        builder2.setSize(8);
        Sandwich sandwich2 = builder2.build();

        List<Sandwich> orders = new ArrayList<>();
        orders.add(sandwich1);
        orders.add(sandwich2);

        // Act
        orders.remove(0);

        // Assert
        assertEquals(1, orders.size());
        assertEquals(7.00, orders.get(0).calculateTotal());
    }
}
