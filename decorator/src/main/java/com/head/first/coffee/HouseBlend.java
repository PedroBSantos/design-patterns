package com.head.first.coffee;

public class HouseBlend extends Beverage {

    public HouseBlend(String description, BeverageSize size) {
        this.description = description;
        this.size = size;
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
