package com.head.first.coffee;

public class DarkRoast extends Beverage {

    public DarkRoast(String description, BeverageSize size) {
        this.description = description;
        this.size = size;
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
