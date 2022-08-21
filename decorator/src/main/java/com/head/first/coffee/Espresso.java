package com.head.first.coffee;

public class Espresso extends Beverage {

    public Espresso(String description, BeverageSize size) {
        this.description = description;
        this.size = size;
    }

    @Override
    public double cost() {
        return 8.0;
    }
}
