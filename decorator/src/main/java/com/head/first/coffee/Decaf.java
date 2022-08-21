package com.head.first.coffee;

public class Decaf extends Beverage {

    public Decaf(String description, BeverageSize size) {
        this.description = description;
        this.size = size;
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
