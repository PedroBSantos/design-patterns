package com.head.first.coffee;

public abstract class Beverage {

    protected String description;
    protected BeverageSize size;

    public String getDescription() {
        return description;
    }

    public BeverageSize getSize() {
        return size;
    }

    public abstract double cost();
}
