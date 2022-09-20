package com.head.first.restaurant;

import java.util.Iterator;

public class MenuItem extends RestaurantMenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String print() {
        return new StringBuilder()
            .append("   ")
            .append(this.name)
            .append(", ")
            .append(this.price)
            .append("  --")
            .append(this.description)
            .append(", ")
            .append("vegetarian: ")
            .append(this.vegetarian)
            .toString();
    }

    @Override
    public Iterator<RestaurantMenuComponent> createIterator() {
        return new NullIterator();
    }
}
